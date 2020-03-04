package com.mirror.test;

import com.mirror.dao.AccountDao;
import com.mirror.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author Mirror
 * @CreateDate 2020/2/28.
 */
public class TestMyBatis {
    //抽取初始化 以及销毁方法
    private InputStream in;
    private SqlSession session;
    private AccountDao accountDao;

    @Before
    public void init() throws Exception{
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.txt");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession(true);
        //4.使用SqlSession创建Dao接口的代理对象
        accountDao = session.getMapper(AccountDao.class);
    }

    /**
     * 释放资源
     * @throws Exception
     */
    @After
    public void destroy() throws  Exception{
        in.close();
        session.close();
    }

    /**
     *测试查询所有数据
     */
    @Test
    public void TestMyBatis01(){
//        查询所有数据
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }

    /**
     * 测试保存数据方法
     */
    @Test
    public void TestMyBatis02(){
        accountDao.saveAccount(new Account(null,"张三",1000d));
        System.out.println("保存数据成功");
    }

}

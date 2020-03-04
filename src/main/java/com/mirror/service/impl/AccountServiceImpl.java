package com.mirror.service.impl;

import com.mirror.dao.AccountDao;
import com.mirror.domain.Account;
import com.mirror.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Mirror
 * @CreateDate 2020/2/28.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有信息。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息。。。");
        accountDao.saveAccount(account);
    }
}

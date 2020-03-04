package com.mirror.service;

import com.mirror.domain.Account;

import java.util.List;

/**
 * @Author Mirror
 * @CreateDate 2020/2/28.
 */
public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);

}

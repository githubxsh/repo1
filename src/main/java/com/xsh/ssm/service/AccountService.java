package com.xsh.ssm.service;

import com.xsh.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    //查询全部账户信息
    public List<Account> findAll();

}

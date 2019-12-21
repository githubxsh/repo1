package com.xsh.ssm.service.impl;

import com.xsh.ssm.domain.Account;
import com.xsh.ssm.mapper.AccountMapper;
import com.xsh.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    //查询全部账户信息
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}

package com.ssm.service;

import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  IUserService {

    @Autowired
    private IUserDao iUserDao;


    @Override
    public List<User> findAll() {
        return iUserDao.findAll();
    }

}

package cn.bdqn.service;

import cn.bdqn.dao.loginMapper;
import cn.bdqn.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("loginService")
public class loginServiceImpl implements loginService{
    @Autowired
    private loginMapper loginMapper;

    @Override
    public String deng(String phone) {
        return loginMapper.deng(phone);
    }

    @Override
    public int zhu(user user) {
        return loginMapper.zhu(user);
    }

    @Override
    public boolean pdPhone(String phone) {
        return loginMapper.getPhone(phone)==null;
    }
}

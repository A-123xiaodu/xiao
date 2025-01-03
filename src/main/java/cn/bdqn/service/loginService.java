package cn.bdqn.service;

import cn.bdqn.entity.user;

public interface loginService {

    String deng(String phone);

    int zhu(user user);

    boolean pdPhone(String phone);
}

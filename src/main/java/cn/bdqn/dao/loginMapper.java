package cn.bdqn.dao;

import cn.bdqn.entity.user;
import org.apache.ibatis.annotations.Param;

public interface loginMapper {
    String deng(@Param("phone") String phone);

    int zhu(user user);

    user getPhone(@Param("phone") String phone);
}

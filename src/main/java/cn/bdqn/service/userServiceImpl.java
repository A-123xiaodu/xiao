package cn.bdqn.service;

import cn.bdqn.dao.userMapper;
import cn.bdqn.entity.Smove;
import cn.bdqn.entity.cseat;
import cn.bdqn.entity.screening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class userServiceImpl implements userService{
    @Autowired
    private userMapper userMapper;

    @Override
    public List<Smove> SmoveList() {
        return userMapper.SmoveList();
    }

    @Override
    public Smove changId(Integer id) {
        return userMapper.changId(id);
    }

    @Override
    public List<cseat> dingPById(Integer cid) {
        return userMapper.dingPById(cid);
    }
}

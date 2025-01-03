package cn.bdqn.service;

import cn.bdqn.entity.Smove;
import cn.bdqn.entity.cseat;
import cn.bdqn.entity.screening;

import java.util.List;

public interface userService {

    List<Smove> SmoveList();

    Smove changId(Integer id);

    List<cseat> dingPById(Integer cid);
}

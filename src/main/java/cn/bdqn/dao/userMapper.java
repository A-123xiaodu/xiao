package cn.bdqn.dao;

import cn.bdqn.entity.Smove;
import cn.bdqn.entity.cseat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    List<Smove> SmoveList();
    Smove changId(@Param("id") Integer id);

    List<cseat> dingPById(@Param("cid") Integer cid);
}

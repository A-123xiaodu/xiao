package cn.bdqn.controller;

import cn.bdqn.entity.user;
import cn.bdqn.service.loginService;
import cn.bdqn.service.loginServiceImpl;
import cn.bdqn.util.yanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("login")
public class loginController {
    JedisPool jedisPool=new JedisPool("127.0.0.1",6379);
    @Autowired
    @Qualifier("loginService")
    private loginService login=null;

    @Autowired
    private StringRedisTemplate str;
    @GetMapping("yan")
    public String yan(String phone){
        str.afterPropertiesSet();
        phone=phone==null?"":phone;
        boolean matches = phone.matches("1[1-8]\\d{9}");
        if(!matches) {
            return "false";
        }
        String deng = login.deng(phone);
        if (deng==null) {
            return "false";
        }
        String yan = yanUtil.yan();
        str.opsForValue().set(phone,yan);
        return yan;
    }
    @RequestMapping("deng")
    public String deng(String phone,String yan){
        Jedis jedis = jedisPool.getResource();
        phone=phone==null?"":phone;
        yan=yan==null?"":yan;
        boolean dian = phone.matches("1[1-8]\\d{9}");
        boolean yanZM = yan.matches("\\d{6}");
        if(!dian || !yanZM){
            return "ge";
        }
        String s = jedis.get(phone);
        if(!yan.equals(s)){
            return "false";
        }
        jedis.expire(phone,86400);
        ThreadLocal<String>threadLocal=new ThreadLocal<>();
        threadLocal.set(phone);
        return "true";
    }
    @GetMapping("zhu")
    public String zhu(user user){
        String username = user.getUsername();
        if(username==null || username.length()<3 || username.length()>7){
            return "notName";
        }
        String password=user.getPassword();
        if(user.getPassword()==null || !password.matches("(\\d{7,9})")){
            return "notPassword";
        }
        if(user.getPhone()==null || !user.getPhone().matches("[1-8]\\d{10}") || !login.pdPhone(user.getPhone())){
            return "notPhone";
        }
        if (login.zhu(user)>0) {
            return "true";
        }else{
            return "false";
        }
    }
}
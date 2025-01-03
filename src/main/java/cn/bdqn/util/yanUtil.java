package cn.bdqn.util;

import java.util.Random;

public class yanUtil {
    public static String yan(){
        Random random=new Random();
        StringBuilder str=new StringBuilder();
        String[]hao={"1","2","3","4","5","6","7","8","9","0"};
        for (int i = 0; i < 6; i++) {
            str.append(hao[random.nextInt(hao.length)]);
        }
        return str.toString();
    }
}

package cn.com.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangmaofang
 * @date 2019/07/15 17:06
 */
public class Test03 {
    public static Boolean isOne(String num){
        if (!num.matches("^[0-9]*$")){
            throw new RuntimeException("不是数字");
        }
        else if (num.matches("^([0]*[1-3]?[0-9])$")){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println("1853_0101".equals("0101"));
        System.out.println(isOne("00009"));
        List<Integer> ids = new ArrayList<Integer>();
    }
}

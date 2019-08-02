package cn.com.learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jiangmaofang
 * @date 2019/07/03 9:34
 */

public class Test01 {
    public static void main(String[] args){
//        Map<String, Object> dict= new HashMap<String, Object>();
//        dict.put("key1", 1);
//        dict.put("key2", "你好");
//        dict.put("key3", 3.0);
//        Iterator iterator = null;
//        StringBuffer str = new StringBuffer();
//        for (iterator = dict.keySet().iterator(); iterator.hasNext(); ) {
//            String key = (String)iterator.next();
//            str.append(" and "+key+"=:"+key);
//        }
//        System.out.println(str);
        Test02 test02 = new Test02();
        String pattern = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
        String str = "01";
        System.out.println(str.matches(pattern));
    }
}

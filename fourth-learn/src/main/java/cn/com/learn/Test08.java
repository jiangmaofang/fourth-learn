package cn.com.learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author jiangmaofang
 * @date 2019/08/08 15:58
 */
public class Test08 {
    public static void main(String[] args){
        //
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("凯旋", 20);
        map.put("宿舍", "13栋2701");
        System.out.println("==================键值对==================");
        for (Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + ", " + "value = " + entry.getValue());
        }
        System.out.println("==================键值对==================");
        for(String key : map.keySet()){
            System.out.println("key = " + key + ", " + "value = " + map.get(key));
        }
        System.out.println("==================值==================");
        for(Object value : map.values()){
            System.out.println("value = " + value);
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        System.out.println("==================键值对==================");
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            System.out.println("key = " + entry.getKey() + ", " + "value = " + entry.getValue());
        }
    }
}

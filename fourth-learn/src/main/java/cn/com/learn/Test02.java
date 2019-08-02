package cn.com.learn;

/**
 * @author jiangmaofang
 * @date 2019/07/13 19:46
 */
public class Test02 {
    private String name = "你好";

    public Test02(){
        super();
    }

    public Test02(String name){
        this.name = name;
    }

    public String getString(){
        return this.name;
    }

}

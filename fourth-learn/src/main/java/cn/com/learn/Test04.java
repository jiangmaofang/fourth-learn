package cn.com.learn;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangmaofang
 * @date 2019/07/24 20:27
 */

public class Test04 {
    public static void main(String[] args){
        List<Person> collection = new ArrayList<Person>(16);
        putPerson(collection);
        System.out.println(collection);

        Integer a = 1;
        add(a);
        System.out.println(a);

        StringBuffer b = new StringBuffer();
        append(b);
        System.out.println(b);

        Person person = new Person();
        person.setName("雄安吗");
        person.setAge(11);
    }

    private static void append(StringBuffer b) {
        b.append("nihao");
    }

    private static void add(Integer a) {
        a = a + 1;
    }

    private static void putPerson(List<Person> collection) {
        Person person = new Person();
        person.setAge(11);
        person.setName("nihao");
        collection.add(person);
    }
}

@Data
class Person{
    private String name;
    private Integer age;
}


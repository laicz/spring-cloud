/**
 * Date:     2019/3/2623:14
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.proto.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * 在浅copy中，除了8中基本类型和String，其他的会默认将引用放置到copy对象中
 * 2019/3/26  23:14
 * created by zhoumb
 */
public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setAge(40);
        person.setUsername("庄曼娟");
        List<Person> children = new ArrayList<>();
        children.add(new Person("周扒皮", 11));
        person.setChildren(children);

        Person clone = (Person) person.clone();
        System.out.println(clone);
        System.out.println(person.getChildren() == clone.getChildren());
    }
}

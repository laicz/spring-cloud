/**
 * Date:     2019/3/2623:11
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.proto.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019/3/26  23:11
 * created by zhoumb
 */
public class Person implements Cloneable {

    private String username;
    private int age;
    private List<Person> children = new ArrayList<Person>();

    public Person() {
    }

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person)super.clone();
        return clone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", children=" + children +
                '}';
    }
}

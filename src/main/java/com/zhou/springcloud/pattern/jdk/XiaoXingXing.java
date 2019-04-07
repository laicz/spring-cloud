/**
 * Date:     2019/3/2410:37
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.jdk;

/**
 * 2019/3/24  10:37
 * created by zhoumb
 */
public class XiaoXingXing implements Person {
    private String sex = "女";
    private String name = "小星星";

    @Override
    public void findLove() {
        System.out.println("我是" + this.name + " , 性别：" + this.sex + "我对对象的要求：");
        System.out.println("高富帅");
        System.out.println("有房有车");
        System.out.println("身高要求180 ");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

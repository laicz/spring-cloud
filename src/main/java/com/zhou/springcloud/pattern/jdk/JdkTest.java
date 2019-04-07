/**
 * Date:     2019/3/2410:39
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.jdk;

/**
 * 2019/3/24  10:39
 * created by zhoumb
 */
public class JdkTest {

    public static void main(String[] args) {
        /*XiaoXingXing xiaoXingXing  = new XiaoXingXing();
        xiaoXingXing.findLove();*/
        Person xiaoxingxing = (Person)new MeiPo().instance(new XiaoXingXing());
        xiaoxingxing.findLove();
    }
}

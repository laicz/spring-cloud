/**
 * Date:     2019/3/2412:11
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.cglib;

/**
 * 2019/3/24  12:11
 * created by zhoumb
 */
public class CglibTest {
    public static void main(String[] args) {
        PhantomService phantomService = (PhantomService) new RecordCglib().instance(new PhantomService());
        phantomService.phantom();
    }
}

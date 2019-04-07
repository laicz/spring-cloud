/**
 * Date:     2019/3/2412:06
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 2019/3/24  12:06
 * created by zhoumb
 */
public class RecordCglib implements MethodInterceptor {
    private Object target;

    public Object instance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        //设置对调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 开始");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib 结束");
        return o1;
    }
}

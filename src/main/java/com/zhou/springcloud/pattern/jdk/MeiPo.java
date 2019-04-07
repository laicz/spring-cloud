/**
 * Date:     2019/3/2410:41
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/3/24  10:41
 * created by zhoumb
 */
public class MeiPo implements InvocationHandler {
    private Object target;

    public Object instance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理之前 ... ");
        Object invoke = method.invoke(target, args);
        System.out.println("动态代理之后 ... ");
        return invoke;
    }
}

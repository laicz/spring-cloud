/**
 * Date:     2019/3/2410:10
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 2019/3/24  10:10
 * created by zhoumb
 */
@Component
@Aspect
public class MethodAop {

    @Before(value = "@annotation(MethodTime)")
    public void before() {
        System.out.println("before");
    }

}

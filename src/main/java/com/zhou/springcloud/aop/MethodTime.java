/**
 * Date:     2019/3/2410:09
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2019/3/24  10:09
 * created by zhoumb
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodTime {
}

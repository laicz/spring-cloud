/**
 * Date:     2019/3/2422:14
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.delegate;

/**
 * 2019/3/24  22:14
 * created by zhoumb
 */
public interface IExecutor {

    //普通员工执行任务
    //在公司中，员工执行任务
    //规定在一周之内必须完成
    void doing();
}

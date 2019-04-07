/**
 * Date:     2019/3/2422:50
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.delegate;

/**
 * 2019/3/24  22:50
 * created by zhoumb
 */
public class ExecutorA implements IExecutor {
    @Override
    public void doing() {
        System.out.println("员工A执行任务 ... ");
    }
}

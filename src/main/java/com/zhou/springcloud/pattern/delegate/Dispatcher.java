/**
 * Date:     2019/3/2422:52
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.delegate;

/**
 * 2019/3/24  22:52
 * created by zhoumb
 */
public class Dispatcher implements IExecutor {
    private IExecutor executor;

    public Dispatcher(IExecutor executor) {
        this.executor = executor;
    }

    //不需要具体做事
    @Override
    public void doing() {
        this.executor.doing();
    }
}

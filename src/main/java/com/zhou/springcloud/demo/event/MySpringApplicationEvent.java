/**
 * Date:     2019/3/2121:10
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.demo.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * 2019/3/21  21:10
 * created by zhoumb
 */
public class MySpringApplicationEvent extends ApplicationEvent {

    private final ApplicationContext context;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     *//*
    public MySpringApplicationEvent(Object source) {
        super(source);
        context = null;
    }*/
    public MySpringApplicationEvent(ApplicationContext context, Object source) {
        super(source);
        this.context = context;
    }

    public ApplicationContext getContext() {
        return context;
    }
}

/**
 * Date:     2019/3/2121:08
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring 自定义 时间/监听器
 * 2019/3/21  21:08
 * created by zhoumb
 */
public class SpringEventListenerDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册监听器
        context.addApplicationListener(new ApplicationListener<MySpringApplicationEvent>() {
            //监听器得到事件
            @Override
            public void onApplicationEvent(MySpringApplicationEvent event) {
                System.out.println(event.getSource() + " @ " + event.getContext());
            }
        });
        context.refresh();
        //发布事件
        context.publishEvent(new MySpringApplicationEvent(context,"Hello,World  ... "));
        context.publishEvent(new MySpringApplicationEvent(context,1));
        context.publishEvent(new MySpringApplicationEvent(context,"Hello,World1  ... "));
        context.publishEvent(new MySpringApplicationEvent(context,"Hello,World2  ... "));
    }
}

/**
 * Date:     2019/3/2316:33
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019/3/23  16:33
 * created by zhoumb
 */
@RestController
public class ConcurrentController {

    @GetMapping(value = "/sleep")
    public String sleep(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
        return "notify";
    }

    @GetMapping(value = "/other")
    public String other() {
        return "other";
    }
}

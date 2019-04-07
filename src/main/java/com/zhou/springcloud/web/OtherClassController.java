/**
 * Date:     2019/3/2316:35
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.web;

import com.zhou.springcloud.aop.MethodTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019/3/23  16:35
 * created by zhoumb
 */
@RestController
public class OtherClassController {

    @GetMapping(value = "/anOther")
    @MethodTime
    public String anOther() {
        return "an other";
    }
}

/**
 * Date:     2019/3/2315:26
 * AUTHOR:   Administrator
 */
package com.zhou.springribbon.web;

import com.netflix.discovery.converters.Auto;
import com.zhou.springribbon.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 使用断路器
 * 2019/3/23  15:26
 * created by zhoumb
 */
@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping(value = "/success")
    public String success() {
        return hystrixService.success();
    }

    @GetMapping(value = "/fail")
    public String fail() {
        return hystrixService.fail();
    }
}

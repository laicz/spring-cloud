/**
 * Date:     2019/3/2310:51
 * AUTHOR:   Administrator
 */
package com.zhou.organizationservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2019/3/23  10:51
 * created by zhoumb
 */
@RestController
public class ConsumerController {

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("执行..........");
        return "Hello,Spring cloud";
    }

}

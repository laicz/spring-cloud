/**
 * Date:     2019/3/2310:51
 * AUTHOR:   Administrator
 */
package com.zhou.springribbon.web;

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
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://organization-service/hello", String.class).getBody();
    }

}

/**
 * Date:     2019/3/2315:30
 * AUTHOR:   Administrator
 */
package com.zhou.springribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 2019/3/23  15:30
 * created by zhoumb
 */
@Service
public class HystrixService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String success() {
        return restTemplate.getForEntity("http://organization-service/hello", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public String fail() {
        return restTemplate.getForEntity("http://organization-service/hello1", String.class).getBody();
    }

    public String fallback() {
        return "this is fall back method ";
    }
}

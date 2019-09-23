package com.weimin.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: TestController
 * @Author: liuweimin
 * @Date: 2019-09-04 10:17
 * @Description: test api
 * @Version: 1.0
 **/

@Controller
@RequestMapping("/app")
public class TestController {
    @Value("${service.env.type}")
    private String env;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/test")
    @ResponseBody
    public String testApi() {
        return String.format("Hello,%s", env);
    }

    @RequestMapping("/services")
    @ResponseBody
    public Object services() {
        return discoveryClient.getInstances("microService");
    }

    @RequestMapping("/discover")
    @ResponseBody
    public String discover() {
        return loadBalancerClient.choose("microService").getUri().toString();
    }

    @RequestMapping("/call")
    @ResponseBody
    public String call() {
        ServiceInstance service = loadBalancerClient.choose("microService");
        String callResult = new RestTemplate().getForObject(service.getUri().toString() + "/app/test", String.class);
        return callResult;
    }
}

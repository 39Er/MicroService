package com.weimin.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: TestController
 * @Author: liuweimin
 * @Date: 2019-09-04 10:17
 * @Description: test api
 * @Version: 1.0
 **/

@Controller
public class TestController {
    @RequestMapping("/hi")
    @ResponseBody
    public String testApi() {
        return "HELLO,Gateway";
    }

}

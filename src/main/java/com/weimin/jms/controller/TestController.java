package com.weimin.jms.controller;

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
@RequestMapping("/app")
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String testApi() {
        return "HELLO,WORLD";
    }
}

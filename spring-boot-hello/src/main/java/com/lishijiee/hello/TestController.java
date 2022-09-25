package com.lishijiee.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/ok")
    public String testOk(){
        return "OK200";
    }
}

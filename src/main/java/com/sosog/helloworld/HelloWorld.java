package com.sosog.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : huyanzhuo
 * @date : 2019/1/2 3:44 PM
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public  String sayHello(){
        return "Hello World!";
    }
}

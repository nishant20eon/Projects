package com.springboot;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
// Object is store in Spring IOC container
public class DemoController {

    @Autowired
    Demo demo;
    private static final Logger logger= LoggerFactory.getLogger(DemoController.class);
    // fn+f4 to open source code

    public DemoController()
    {
        logger.info("Creating Object for DemoController {}", this);
        //Creating Object for DemoController com.springboot.DemoController@4d96250
        //Why this message is not printing 2 times
    }

    @GetMapping("/sample")
    public Demo getDemo()
    {
//        Demo demo=new Demo();
        logger.info("demo response : "+ demo);
        return demo;
    }

}

//  API 1st call : demo response : com.springboot.Demo@20fe1737
// API 2nd call : demo response : com.springboot.Demo@7266541e
//          Object are different since we are creating with new Keyword


//  API 1st call : demo response : com.springboot.Demo@2189ad35
// API 2nd call : demo response : com.springboot.Demo@2189ad35
//          Object are same since we are creating with Autowired



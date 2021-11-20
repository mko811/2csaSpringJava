/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mko
 */
@RestController                                        // rest API controller
@RequestMapping("/api/v1")                                // path of our request
@CrossOrigin("*")                                           // we can allow different types of requests with this annotation
public class HelloController {      // this is one of our controller classes
    
    @RequestMapping("/hello")                          // this makes our hello method an API call
                                                       // /hello is our path
    public String hello(){
        return "API is active!";
    }
}

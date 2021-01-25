package com.mld.hello.service;

import com.mld.hello.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    private HelloProperties helloProperties;

    public String sayHello(String userName) {
        return helloProperties.getPrefix() + "-" + userName + "-" + helloProperties.getSuffix();
    }
}

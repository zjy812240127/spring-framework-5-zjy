package com.zjut.configurationBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.zjut.configurationBean")
public class MyComponentScan {

    @ComponentScan("com.zjut.selfTag")
    @Configuration
    @Order(90)
    class InnerClass{

    }


}

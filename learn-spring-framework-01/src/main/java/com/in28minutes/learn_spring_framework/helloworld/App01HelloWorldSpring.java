package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01HelloWorldSpring {
    public static void main(String[] args) {
        //1: launch a spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);)
        {
            //2: configure the things that we want spring to manage - @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("person5Qualifies"));

            System.out.println(context.getBean(Address.class));
        }





    }
}

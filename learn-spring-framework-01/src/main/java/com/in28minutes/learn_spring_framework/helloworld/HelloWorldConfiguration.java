package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String city){}
record Person(String name, int age, Address address){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Deepoo";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    public Person person(){
        return new Person("spider", 30, new Address("main St", "Egypt"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifies(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Naser City st33", "Cairo");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Naser City st33", "Cairo");
    }


}

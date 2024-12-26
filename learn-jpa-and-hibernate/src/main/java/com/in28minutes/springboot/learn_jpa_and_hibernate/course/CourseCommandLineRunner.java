package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS JPA!", "in28minutes"));
//        repository.insert(new Course(2, "Learn Azure JPA!", "in28minutes"));
//        repository.insert(new Course(3, "Learn Devops JPA!", "in28minutes"));


        repository.save(new Course(1, "Learn AWS JPA!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure JPA!", "in28minutes"));
        repository.save(new Course(3, "Learn Devops JPA!", "in28minutes"));


        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

//        System.out.println(repository.findByAuthor("in28minutes"));
//        System.out.println(repository.findByAuthor(""));
//
//        System.out.println(repository.findByName("Learn AWS Jpa!"));
//        System.out.println(repository.findByName("Learn DevOps Jpa!"));
    }

}
package com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
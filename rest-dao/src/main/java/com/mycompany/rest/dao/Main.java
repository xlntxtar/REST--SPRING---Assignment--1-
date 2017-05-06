/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.dao;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author w208999498
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dao-springConfig.xml"});
        
        StudentDAO stdDAO = (StudentDAO) context.getBean("studentDAO");
        
//        Student student = new Student();
//        student.setFirstname("Adam");
//        student.setLastname("Smith");
//        student.setAddress("1888 Main street");
//        
//        stdDAO.persist(student);
        
       List<Student> list = stdDAO.getAllStudents();
       
       for (Student std : list){
           System.out.println("First Name: "+ std.getFirstname());
       }
   
       
    }
}

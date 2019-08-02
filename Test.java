package com.bbit2.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class Test implements CommandLineRunner {


    @Override
    public void run(String...args)throws Exception{

        RestTemplate restTemplate = new RestTemplate();

//Register student
        String createStudentUrl="http://10.51.10.111:1000/registrations";

        Student newStudent = new Student("Phillip Ndengera","082723");

        Student createdStudent = restTemplate.postForObject(createStudentUrl,newStudent,Student.class);

        System.out.println(createdStudent.toString());


//View units
        Unit unit = restTemplate.getForObject("http://10.51.10.111:1000/units",Unit.class);
        System.out.println(unit.toString());



    }







}

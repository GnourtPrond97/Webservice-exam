package com.example.stringbootws.service;

import com.example.stringbootws.entity.Student;
import com.example.stringbootws.repository.StudentRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component(value = "StudentService")
@WebService
public class StudentService {
    @Autowired
     StudentRepoitory studentRepoitory;

    @WebMethod
    public boolean save(Student student) {
        studentRepoitory.save(student);
        return true;
    }
}

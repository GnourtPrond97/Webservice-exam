package com.example.stringbootws.repository;

import com.example.stringbootws.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepoitory extends JpaRepository<Student, String> {
}

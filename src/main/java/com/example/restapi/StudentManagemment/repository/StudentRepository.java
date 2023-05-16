package com.example.restapi.StudentManagemment.repository;

import com.example.restapi.StudentManagemment.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,String> {
}

package com.example.springexercises.repository;

import com.example.springexercises.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository <Employee,Long> {
}

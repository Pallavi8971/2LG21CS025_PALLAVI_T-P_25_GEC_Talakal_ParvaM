package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Employee;
import com.example.studentcrud.repository.pallaviEmployeeRepository;

@Service
public class pallaviEmployeeService {

    @Autowired
    private  pallaviEmployeeRepository EmployeeRepository;

    public List<Employee> listAll() {
        return EmployeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        EmployeeRepository.save(employee);
    }

    public Employee getEmployee(Long id) {
        return EmployeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        EmployeeRepository.deleteById(id);
    }

    

    
}

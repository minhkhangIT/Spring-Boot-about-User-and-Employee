package io.github.tubean.myspringcrud.service.impl;

import io.github.tubean.myspringcrud.entity.Employee;
import io.github.tubean.myspringcrud.repository.EmployeeRepository;
import io.github.tubean.myspringcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
   private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee(){
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee){
     employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id){
     employeeRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id){
     return employeeRepository.findById(id);
    }
}

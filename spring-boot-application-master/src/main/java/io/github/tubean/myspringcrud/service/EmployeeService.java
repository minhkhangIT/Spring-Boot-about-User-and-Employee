package io.github.tubean.myspringcrud.service;

import io.github.tubean.myspringcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

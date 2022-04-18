package io.github.tubean.myspringcrud.repository;

import io.github.tubean.myspringcrud.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}

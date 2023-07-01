package com.abc.ems.REPOSITORY;

import com.abc.ems.ENTITY.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Integer> {
    public Employee findByEmpId(int empId);
    public void deleteByEmpId(int empId);
}

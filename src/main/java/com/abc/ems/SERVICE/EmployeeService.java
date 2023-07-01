package com.abc.ems.SERVICE;

import com.abc.ems.ENTITY.Employee;
import com.abc.ems.REPOSITORY.EmployeeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepositoryInterface eri;

    public List<Employee> getAllEmployees(){
        List<Employee> allEmployees = eri.findAll();
        return allEmployees;
    }

    public void addThisEmployee(Employee e) {
        eri.save(e);
    }

    public Employee getThisEmployee(int empId){
        Employee e = eri.findByEmpId(empId);
        return e;
    }

    public void updateThisEmployee(int empId, Employee updated) {
        Employee e = eri.findByEmpId(empId);
        e.setEmpName(updated.getEmpName());
        e.setEmpCity(updated.getEmpCity());
        e.setEmpJobRole(updated.getEmpJobRole());
        e.setEmpSalary(updated.getEmpSalary());
        eri.save(e);
    }

    public void deleteThisEmployee(int empId) {
        Employee e = eri.findById(empId).get();
        System.out.println(e.toString());
        eri.delete(e);
    }
}

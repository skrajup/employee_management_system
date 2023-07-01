package com.abc.ems.CONTROLLER;

import com.abc.ems.ENTITY.Employee;
import com.abc.ems.SERVICE.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @PostMapping("/addEmployeeData")
    public String addEmployeeData(Employee e){
        es.addThisEmployee(e);
        return "redirect:/listAllEmployees";
    }

    @GetMapping("/view/{empId}")
    public String viewEmployeeData(@PathVariable("empId") int empId, Model m){
        Employee e = es.getThisEmployee(empId);
        m.addAttribute("employee", e);
        System.out.println(e.toString());
        return "employeeview";
    }

    @GetMapping("/update/{empId}")
    public String updateEmployeeForm(@PathVariable("empId") int empId, Model m){
        Employee e = es.getThisEmployee(empId);
        m.addAttribute("employee", e);
        return "employeeupdateform";
    }

    @PostMapping("/update/{empId}")
    public String updateEmployeeData(@PathVariable("empId") int empId, Employee updated){
        es.updateThisEmployee(empId, updated);
        return "redirect:/listAllEmployees";
    }

    @GetMapping("/delete/{empId}")
    public String deleteEmployeeData(@PathVariable("empId") int empId){
        System.out.println(empId);
        es.deleteThisEmployee(empId);
        return "redirect:/listAllEmployees";
    }
}

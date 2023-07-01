package com.abc.ems.CONTROLLER;

import com.abc.ems.ENTITY.Employee;
import com.abc.ems.SERVICE.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomepageController {

    @Autowired
    EmployeeService es;
    @GetMapping("/")
    public String Homepage(){
        return "homepageview";
    }

    @GetMapping("/addEmployeeForm")
    public String employeeFormPage(Model m){
        Employee e = new Employee();
        m.addAttribute("employee", e);
        return "employeeformview";
    }

    @GetMapping("/listAllEmployees")
    public String listAllEmployees(Model m){
        List<Employee> employees = es.getAllEmployees();
        m.addAttribute("employees", employees);
        return "listallemployeesview";
    }


}

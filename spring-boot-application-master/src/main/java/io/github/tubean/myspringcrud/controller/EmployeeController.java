package io.github.tubean.myspringcrud.controller;

import io.github.tubean.myspringcrud.entity.Employee;
import io.github.tubean.myspringcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public String employeeindex(Model model) {
        List<Employee> employees = employeeService.getAllEmployee();

        model.addAttribute("employees", employees);

        return "employeeindex";
    }
    @RequestMapping(value = "addEmployee")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }
    @RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
    public String saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }
    @RequestMapping(value = "/editE", method = RequestMethod.GET)
    public String editEmployee(@RequestParam("id") Long employeeId, Model model) {
        Optional<Employee> employeeEdit = employeeService.findEmployeeById(employeeId);
        employeeEdit.ifPresent(employee -> model.addAttribute("employee", employee));
        return "editEmployee";
    }
    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
    public String deleteEmployee(@RequestParam("id") Long employeeId, Model model) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/employee";
    }

}

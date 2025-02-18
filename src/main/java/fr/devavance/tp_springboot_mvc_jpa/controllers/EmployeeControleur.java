package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.IEmployeeRepository;
import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeRepository employeeRepository;

    public EmployeeControleur(IEmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model model){
        model.addAttribute("employees",this.employeeRepository.findAll());
        model.addAttribute("employee",new Employee());
        return "view_employees";
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("employees",this.employeeRepository.findAll());
        return "view_home";
    }

    @RequestMapping("/addemployee")
    public String addEmployee(Employee employee){
        this.employeeRepository.save(employee);
        return "redirect:/";
    }
}

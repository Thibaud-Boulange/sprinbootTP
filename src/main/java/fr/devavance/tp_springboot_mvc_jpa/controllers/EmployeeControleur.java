package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.IEmployeeController;
import fr.devavance.tp_springboot_mvc_jpa.IEmployeeRepository;
import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeControleur implements IEmployeeController {

    @Autowired
    private IEmployeeRepository employeeRepository;

    public EmployeeControleur(IEmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping(value={"/employee/home","/employee"},method= RequestMethod.GET)
    public String displayHome(Model model){
        model.addAttribute("employees",this.employeeRepository.findAll());
        model.addAttribute("employee",new Employee());
        return "view_home";
    }

    @RequestMapping(value={"/employee/addemployee"},method= RequestMethod.POST)
    public String addEmployee(Employee employee){
        this.employeeRepository.save(employee);
        return "redirect:/employee";
    }
}

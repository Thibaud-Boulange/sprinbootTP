package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.dao.EmployeeDAOImpl;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeDAO emplopyeeDAO;

    public EmployeeControleur(IEmployeeDAO emplopyeeDAO){

        this.emplopyeeDAO = emplopyeeDAO;
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model model){
        model.addAttribute("employees",this.emplopyeeDAO.findAll());
        return "view_employees";
    }
}

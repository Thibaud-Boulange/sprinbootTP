package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.dao.EmployeeDAOImpl;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeDAO emplopyeeDAO;

    public EmployeeControleur(IEmployeeDAO e){
        this.emplopyeeDAO = e;
    }
}

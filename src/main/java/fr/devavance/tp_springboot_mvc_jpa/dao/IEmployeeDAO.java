package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> findAll();

    public void add(Employee e);
}

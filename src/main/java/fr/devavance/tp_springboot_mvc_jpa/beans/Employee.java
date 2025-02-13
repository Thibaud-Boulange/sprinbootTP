package fr.devavance.tp_springboot_mvc_jpa.beans;

import fr.devavance.tp_springboot_mvc_jpa.Fonction;
import lombok.Data;

@Data
public class Employee {
    private String name;
    private String email;
    private String phone;
    private String address;
    private Fonction fonction;

    public Employee(){
        this.name = null;
        this.email = null;
        this.phone = null;
        this.address = null;
        this.fonction = null;
    }
    public Employee(String name, String email, String phone, String address, Fonction fonction){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.fonction = fonction;
    }
}

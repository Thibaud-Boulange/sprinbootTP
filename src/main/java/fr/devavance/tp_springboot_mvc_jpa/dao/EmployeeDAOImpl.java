package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.Fonction;
import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class EmployeeDAOImpl implements IEmployeeDAO{

    private ArrayList<Employee> ls_employee;

    public EmployeeDAOImpl(){
        this.ls_employee = new ArrayList<Employee>();
        this.add(new Employee("Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        this.add(new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));
        this.add(new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET));
        this.add(new Employee("Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI));
        this.add(new Employee("Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT));
        this.add(new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI));
        this.add(new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB));
        this.add(new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS)
        );

    }


    public ArrayList<Employee> findAll(){return this.ls_employee;}

    public void add(Employee e){ this.ls_employee.add(e);}

}

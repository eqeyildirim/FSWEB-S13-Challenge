package org.example;
import java.util.Locale;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        executeTasks();
    }
    public  static  void executeTasks(){
        Healthplan healthplan1 = new Healthplan(1, "Basic Health", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Premium Health", Plan.PREMIUM);

        String[] healthsplansArray = new String[3];
        Employee employee = new Employee(101,"John Doe","john.doe@example.com","password123",healthsplansArray);

        employee.addHealthPlan(0, healthplan1.getName());
        employee.addHealthPlan(1, healthplan2.getName());
        employee.addHealthPlan(1, "Enterprise Health");
        employee.addHealthPlan(5, "Invalid Index Health");

        String[] developerNamesArray = new String[3];
        Company company = new Company(1, "TechCorp", 500000, developerNamesArray);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        company.addEmployee(1, "Charlie");
        company.addEmployee(4, "Invalid Index Employee");

        System.out.println(healthplan1.toString());
        System.out.println(healthplan2.toString());
        System.out.println(employee.toString());
        System.out.println(company.toString());
    }
}
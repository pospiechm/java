package Karolina.brudnopis.Wzorce.Kompozyt;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String familyName;
    private Department department;
    private double salary;
    private static List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String familyName, Department department, double salary) {
        this.name = name;
        this.familyName = familyName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getFamilyName() {
        return familyName;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    enum Department {
        IT, FINANCE, MANAGEMENT, HR
    }


//  Działające zrobione streamem
//    public void addSubordinate(Employee toAdd) {
//        if (subordinates.stream().noneMatch(su-> su.getName().equals(toAdd.getName())))
//        subordinates.add(toAdd);
//    }

    public void addSubordinate(Employee subordinate) {
        this.subordinates.add(subordinate);
    }

    public double sumSubordinatesSalaries() {
        double sum = 0;
        for (Employee pracownik : subordinates) {
            sum += pracownik.salary;
        }
        return sum;

        // Zrobione na streamie
        // return subordinates.stream().map(s -> s.salary).reduce(0.0, Double::sum);
    }

    public void showAllSubordinates(){
        for (Employee s : subordinates){
            System.out.println(s);
            s.showAllSubordinates();
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
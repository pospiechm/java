package Karolina.brudnopis.Wzorce.Kompozyt;

public class Main {
    public static void main(String[] args) {



    Employee kasia = new Employee("Kasia", "Majzel", Employee.Department.IT, 100000);
    Employee michal = new Employee("Michal", "Pośpiech", Employee.Department.MANAGEMENT, 50000);
    Employee mirek = new Employee("Mirek", "Pośpiech", Employee.Department.MANAGEMENT, 25000);
    Employee marcin = new Employee("Marcin", "Pośpiech", Employee.Department.IT, 5000);
    michal.addSubordinate(kasia);
    michal.addSubordinate(mirek);
    kasia.addSubordinate(marcin);
        System.out.println("SUma pensji podwładnych");
    System.out.println(kasia.sumSubordinatesSalaries());
        System.out.println("Drzewko podwładnych");
   michal.showAllSubordinates();

    }
}

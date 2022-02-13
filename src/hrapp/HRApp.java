/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author opc
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "Jerry", 333998);
        Employee e2 = new Employee(230, "Carlos", 3332498);

        Department dept = new Department("Education");

        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(772, "Jack", 2988));

        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);

        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Avg " + dept.getAverageSalary());
        
        System.out.println("EMp " + dept.getEmployeeByID(424242));
    }

}

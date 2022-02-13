/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author opc
 */
public class Department {

    private String name;

    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee anEmployee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;

        }

    }

    public Employee[] getEmployees() {

        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];

        }
        return actualEmployees;

    }

    public int getEmployeeCount() {

        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmployeeByID(int empID) {

        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getID() == (empID)) {
                    return emp;
                }
            }
            return null;
        }

    }

    public double getTotalSalary() {

        double totalSalary = 0.0;

        for (int i = 0; i < lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);

        }
        return 0.0;
    }

    public String toString() {
        return name;

    }

}

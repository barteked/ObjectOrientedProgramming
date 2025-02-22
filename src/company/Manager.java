package company;

import java.util.List;

public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void managerWork() {
        System.out.println("manager make work" + getName());
    }

    @Override
    public void employeeWork() {
        super.employeeWork();
    }

    public void employeeMustWork() {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            employee.employeeWork();
        }
    }
}

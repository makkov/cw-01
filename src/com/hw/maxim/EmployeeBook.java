package com.hw.maxim;

public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    public void add(String fullName, int department, int salary) {
        Employee newEmployee = new Employee(fullName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void printAll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public int getTotalSalary() {
        int result = 0;
        for (Employee e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    public Employee getWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee getWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }

    public double getAvgSalary() {
        return (double) getTotalSalary() / employees.length;
    }

    public void printAllFullNames() {
        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
    }

    //    Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой
    public Employee getEmployeeWithMaxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee e : employees) {
            if (e.getDepartment() == department
                    && (employeeWithMaxSalary == null || e.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }
}

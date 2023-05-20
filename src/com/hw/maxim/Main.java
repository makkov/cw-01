package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("employee1", 1, 30),
                new Employee("employee2", 2, 231512),
                new Employee("employee3", 3, 30232570),
                new Employee("employee4", 4, 1234),
                new Employee("employee5", 5, 3123400),
                new Employee("employee6", 5, 3112300),
                new Employee("employee7", 4, 63522),
                new Employee("employee8", 3, 6543),
                new Employee("employee9", 2, 23466),
                new Employee("employee10", 1, 6244)
        };

        printAll(employees);
        System.out.println("Суммарная зарлата: " + getTotalSalary(employees));
        System.out.println("Сотрудник с минимальной зарлатой: " + getEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарлатой: " + getEmployeeWithMaxSalary(employees));
        System.out.println("Средняя зарлпата: " + getAvgSalary(employees));
        printAllFullNames(employees);

        System.out.println(getEmployeeWithMaxSalaryInDepartment(employees, 1));
    }

    public static void printAll(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static int getTotalSalary(Employee[] employees) {
        int result = 0;
        for (Employee e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getAvgSalary(Employee[] employees) {
        return (double) getTotalSalary(employees) / employees.length;
    }

    public static void printAllFullNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
    }

//    Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой

    public static Employee getEmployeeWithMaxSalaryInDepartment(Employee[] employees, int department) {
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


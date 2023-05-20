package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add("employee1", 1, 30);
        employeeBook.add("employee2", 2, 231512);
        employeeBook.add("employee3", 3, 231512);
        employeeBook.add("employee4", 4, 1512);
        employeeBook.add("employee5", 5, 512);
        employeeBook.add("employee6", 5, 1512);
        employeeBook.add("employee7", 4, 21512);
        employeeBook.add("employee8", 3, 232);
        employeeBook.add("employee9", 2, 2312);
        employeeBook.add("employee10", 1, 231512);

        employeeBook.printAll();
        System.out.println("Суммарная зарлата: " + employeeBook.getTotalSalary());
        System.out.println("Сотрудник с минимальной зарлатой: " + employeeBook.getWithMinSalary());
        System.out.println("Сотрудник с максимальной зарлатой: " + employeeBook.getWithMaxSalary());
        System.out.println("Средняя зарлпата: " + employeeBook.getAvgSalary());
        employeeBook.printAllFullNames();

        System.out.println(employeeBook.getEmployeeWithMaxSalaryInDepartment(1));
    }
}

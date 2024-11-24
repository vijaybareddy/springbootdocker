package com.neoteric.springbootdocker.streams1;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryStatistics {

    public static void main(String[] args) {

        // Sample data
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "Engineering", 75000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Engineering", 80000),
                new Employee("Eve", "Engineering", 70000),
                new Employee("Frank", "Marketing", 55000)
        );

        // Group by department and calculate max, min, and average salary
        Map<String, SalaryStatistics> departmentStats = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> new SalaryStatistics(
                                        list.stream().mapToDouble(Employee::getSalary).max().orElse(0),
                                        list.stream().mapToDouble(Employee::getSalary).min().orElse(0),
                                        list.stream().mapToDouble(Employee::getSalary).average().orElse(0)
                                )
                        )
                ));

        // Display results
        departmentStats.forEach((department, stats) -> {
            System.out.println("Department: " + department);
            System.out.println("Max Salary: " + stats.maxSalary);
            System.out.println("Min Salary: " + stats.minSalary);
            System.out.println("Average Salary: " + stats.avgSalary);
            System.out.println();
        });
    }
}

class SalaryStatistics {
    double maxSalary;
    double minSalary;
    double avgSalary;

    public SalaryStatistics(double maxSalary, double minSalary, double avgSalary) {
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.avgSalary = avgSalary;
    }
}

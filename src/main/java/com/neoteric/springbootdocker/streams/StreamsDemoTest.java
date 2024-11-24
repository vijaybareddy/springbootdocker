package com.neoteric.springbootdocker.streams;

import java.util.*;
import java.util.function.Predicate;

public class StreamsDemoTest {

    public static void main(String[] args) {
        Employee a = new Employee("0", "it");
        System.out.println(a.hashCode());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "it"));
        employeeList.add(new Employee("2", "cse"));
        employeeList.add(new Employee("3", "mech"));
        employeeList.add(new Employee("4", "eee"));

        // Iterating and printing all employees
        for (int startI = 0; startI < employeeList.size(); startI++) {
            System.out.println(employeeList.get(startI).getEmpid() + " " + employeeList.get(startI).hashCode() + " " + startI);
        }

        employeeList.stream().forEach(mydemoEmp -> {
            System.out.println(mydemoEmp.getEmpid() + " " + mydemoEmp.hashCode());
        });

        // Using Predicate for filtering employees by department
        Predicate<Employee> deptPredicate = empPredicate -> empPredicate.getDept().equals("it");
        long itEmpCount = employeeList.stream().filter(emp -> deptPredicate.test(emp)).count();
        System.out.println("IT Employee Count (Stream): " + itEmpCount);

        // Legacy way of counting IT employees
        int itEmpLegeacyCount = 0;
        for (int startI = 0; startI < employeeList.size(); startI++) {
            if (deptPredicate.test(employeeList.get(startI))) {
                itEmpLegeacyCount++;
            }
        }
        System.out.println("IT Employee Legacy Count: " + itEmpLegeacyCount);

        // Adding new employees safely after iteration
        List<Employee> newEmployees = new ArrayList<>();
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee currentEmployee = itr.next();
            System.out.println("Processing: " + currentEmployee);
            if (currentEmployee.getDept().equals("it")) {
                newEmployees.add(new Employee("123", "it"));
            }
        }

        employeeList.addAll(newEmployees); // Add after iteration
        System.out.println("Updated Employee List: " + employeeList);
    }

    Map<Employee,Employee>myEmployeMap=new TreeMap<>();




}

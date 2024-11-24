package com.neoteric.springbootdocker.enummap;

import java.util.*;

public class DepartmentTest {

//    enum Department {
//        HR, IT, SALES, FINANCE
//    }
//

        public static void main(String[] args) {
            // HashSet example
            Set<String> employeesHashSet = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
            System.out.println("HashSet (Unordered Employees):");
            employeesHashSet.forEach(System.out::println);

            // TreeSet example (Ordered employees)
            Set<String> employeesTreeSet = new TreeSet<>(employeesHashSet);
            System.out.println("\nTreeSet (Ordered Employees):");
            employeesTreeSet.forEach(System.out::println);

            // EnumMap example

            EnumMap<DepartmentType, String> departmentHeads = new EnumMap<>(DepartmentType.class);
            departmentHeads.put(DepartmentType.HR, "Alice");
            departmentHeads.put(DepartmentType.IT, "Bob");
            departmentHeads.put(DepartmentType.SALES, "Charlie");
            departmentHeads.put(DepartmentType.FINANCE, "Diana");

            System.out.println("\nEnumMap Department Heads:");
            departmentHeads.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }



package com.neoteric.springbootdocker.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Employee e = new Employee("1", "it");
        Employee e1 = new Employee("2", "ece");
        Employee e2 = new Employee("3", "eee");
        Employee e3 = new Employee("4", "mech");

        // Creating a HashMap to store employees
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put(e.getEmpid(), e);
        employeeMap.put(e1.getEmpid(), e1);
        employeeMap.put(e2.getEmpid(), e2);
        employeeMap.put(e3.getEmpid(), e3);

        // Iterating using Iterator
        Set<Map.Entry<String, Employee>> entrySet = employeeMap.entrySet();
        Iterator<Map.Entry<String, Employee>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Employee> entry = iterator.next();
            System.out.println("Iterator Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterating using Streams
        employeeMap.entrySet().stream().forEach(entry -> {
            System.out.println("Stream Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });
    }
}

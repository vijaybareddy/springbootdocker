package com.neoteric.springbootdocker.enummap;

import java.util.ArrayList;
import java.util.List;

public class Deparment {
    private DepartmentType type;
    private List<String> employees;

    public Deparment(DepartmentType type, List<String> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public void setType(DepartmentType type) {
        this.type = type;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "type=" + type +
                ", employees=" + employees +
                '}';
    }
}
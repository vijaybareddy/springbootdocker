package com.neoteric.springbootdocker.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String id;
    private List<Subject> Subjectlist=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void add(Subject subject){
        this.Subjectlist.add(subject);
    }
}

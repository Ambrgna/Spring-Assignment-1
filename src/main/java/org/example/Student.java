package org.example;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {
    private int id;
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Student() {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Phone=" + ph +
                ", Address=" + add +
                '}';
    }
}

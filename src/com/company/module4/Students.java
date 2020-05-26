package com.company.module4;

import java.io.Serializable;
import java.util.Objects;



public class Students implements Serializable{
    private static final long serialVersionUID = 2078028762783447921L;
    private int id;
    private String name;
    private int age;

    public Students(int id, String name, int age) {
        setId(id);
        this.name = name;
        setAge(age);
    }

    public Students() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }else{
            try {
                throw new AgeException("学号不能为负！");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<150){
            this.age = age;

        }else{
            try {
                throw new AgeException("年龄不合理！");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }

    }

}

package Homework5;

import java.util.Objects;

public class Employees {
    private String name;
    private int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return age == employees.age && Objects.equals(name, employees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

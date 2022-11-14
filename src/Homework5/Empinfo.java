/*
Easy: создайте модель(сущность) json
Medium: easy + реализуйте алгоритм Шелла
Hard: Medium + Сохраните результат обработки массива алгоритмом Шелла  в текстовый файл
*/

package Homework5;

import java.util.Objects;

public class Empinfo {
    private Employees employees;

    public Empinfo() {
    }

    public Empinfo(Employees employees) {
        this.employees = employees;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empinfo empinfo = (Empinfo) o;
        return Objects.equals(employees, empinfo.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees);
    }

    @Override
    public String toString() {
        return "Empinfo{" +
                "employees=" + employees +
                '}';
    }
}

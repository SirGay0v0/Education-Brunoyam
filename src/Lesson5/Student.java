package Lesson5;

import Lesson5.exception.StudentNotFoundException;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String[] hobby;
    private boolean athome;
    private Parents parents;
    private String dogs;

    public Student() {
    }

    public Student(String name, int age, String[] hobby, boolean athome, Parents parents, String dogs) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.athome = athome;
        this.parents = parents;
        this.dogs = dogs;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public boolean isAthome() {
        return athome;
    }

    public void setAthome(boolean athome) {
        this.athome = athome;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public String getDogs() {
        return dogs;
    }

    public void setDogs(String dogs) {
        this.dogs = dogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && athome == student.athome && Objects.equals(name, student.name) && Arrays.equals(hobby, student.hobby) && Objects.equals(parents, student.parents) && Objects.equals(dogs, student.dogs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, athome, parents, dogs);
        result = 31 * result + Arrays.hashCode(hobby);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", athome=" + athome +
                ", parents=" + parents +
                ", dogs='" + dogs + '\'' +
                '}';
    }

    public Student find() throws StudentNotFoundException {
        if (name.equals("Ivan")) {
            return new Student();
        } else throw new StudentNotFoundException("" + "Could not find the student called Ivan " + name);
    }
}

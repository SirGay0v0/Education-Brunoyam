package Lesson5;

import java.util.Objects;

public class Parents {
    private String mother;
    private String father;

    public Parents(String mother, String father) {
        this.mother = mother;
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parents parents = (Parents) o;
        return Objects.equals(mother, parents.mother) && Objects.equals(father, parents.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    public String toString() {
        return "Parents{" +
                "mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}

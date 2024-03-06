package org.example.objects;

import java.util.Objects;

public class Human {
    private String lastname;
    private String name;
    private String otchestvo;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(lastname, human.lastname) && Objects.equals(name, human.name) && Objects.equals(otchestvo, human.otchestvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, name, otchestvo, age);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String lastname, String name, String otchestvo, int age) {
        this.lastname = lastname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", age=" + age +
                '}';
    }
}

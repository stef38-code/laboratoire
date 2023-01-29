package org.hussard.laboratoire.models;

public class Employee {
    private final String gender ;
    private final Integer age;
    private final Integer salary ;
    private final String name ;

    public Employee(String name, Integer age, String gender, Integer salary) {
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

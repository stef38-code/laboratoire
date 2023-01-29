package org.hussard.laboratoire.models.builder;

import org.hussard.laboratoire.models.Employee;

public class EmployeeBuilder implements EmployeeStep,EmployeeStep.Gender,EmployeeStep.Age,EmployeeStep.Salary,EmployeeStep.Create{
    private Integer salary;
    private String name;
    private String gender;
    private Integer age;

    @Override
    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public EmployeeBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public EmployeeBuilder salary(Integer salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Employee create() {
        return new Employee(name,age,gender,salary);
    }
}

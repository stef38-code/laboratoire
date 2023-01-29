package org.hussard.laboratoire.models.builder;

import org.hussard.laboratoire.models.Employee;

public interface EmployeeStep {

        Gender name(String name);
interface Gender {
    Age gender(String gender);
}
   interface Age {
       Salary age(Integer age);
   }

    interface Salary {
        Create salary(Integer salary);
    }
interface Create{
    Employee create();
}

}

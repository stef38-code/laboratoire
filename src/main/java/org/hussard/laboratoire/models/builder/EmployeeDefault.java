package org.hussard.laboratoire.models.builder;

public class EmployeeDefault {
    private EmployeeDefault() {
        throw new UnsupportedOperationException("EmployeeDefault is a utility class and cannot be instantiated");
    }
    public static EmployeeStep aNew(){
        return new EmployeeBuilder();
    }
}

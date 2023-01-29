package org.hussard.laboratoire.models.datas;

import org.hussard.laboratoire.models.Employee;
import org.hussard.laboratoire.models.builder.EmployeeDefault;

import java.util.List;

public class EmployeesDatas {
    private EmployeesDatas() {
        throw new UnsupportedOperationException("employeesDatas is a utility class and cannot be instantiated");
    }

    public static List<Employee> employees() {
        return List.of(
            EmployeeDefault.aNew().name("Bruce WAYNE").gender("M").age(40).salary(9800).create(),
            EmployeeDefault.aNew().name("Clark KENT").gender("M").age(33).salary(1500).create(),
            EmployeeDefault.aNew().name("Barry ALLEN").gender("M").age(23).salary(4500).create(),
            EmployeeDefault.aNew().name("Wally WEST").gender("M").age(19).salary(2400).create(),
            EmployeeDefault.aNew().name("Hal JORDAN").gender("M").age(28).salary(8000).create(),
            EmployeeDefault.aNew().name("Oliver QUEEN").gender("M").age(35).salary(9500).create(),
            EmployeeDefault.aNew().name("Ray PALMER").gender("M").age(42).salary(4700).create(),
            EmployeeDefault.aNew().name("Victor Stone").gender("M").age(22).salary(3600).create(),
            EmployeeDefault.aNew().name("John CONSTANTINE").gender("M").age(27).salary(1500).create(),
            EmployeeDefault.aNew().name("J'onn J'ONZZ").gender("M").age(65).salary(2600).create(),
            EmployeeDefault.aNew().name("Arthur CURRY").gender("M").age(28).salary(1400).create(),
            EmployeeDefault.aNew().name("Dick GRAYSON").gender("M").age(25).salary(2500).create(),
            EmployeeDefault.aNew().name("Diana PRINCE").gender("F").age(65).salary(6000).create(),
            EmployeeDefault.aNew().name("Barbara GORDON").gender("F").age(24).salary(2500).create(),
            EmployeeDefault.aNew().name("Selina KYLE").gender("F").age(36).salary(1800).create(),
            EmployeeDefault.aNew().name("Pamela ISLEY").gender("F").age(30).salary(2400).create(),
            EmployeeDefault.aNew().name("Harleen QUINZEL").gender("F").age(28).salary(2400).create(),
            EmployeeDefault.aNew().name("Zatanna ZATARA").gender("F").age(29).salary(2000).create()
        );
    }
}

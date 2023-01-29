package org.hussard.laboratoire.stream.base;

import org.hussard.laboratoire.models.Employee;
import org.hussard.laboratoire.models.datas.EmployeesDatas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
@DisplayName("Stream ...............")
 class StreamBaseTest {
    @Test
    @DisplayName("Filter -> gender = 'M'")
    void filtrer_Lorsque_GenderEqualM_Attend_() {
        Stream<Employee> resultat = EmployeesDatas.employees().stream().filter(employee -> employee.getGender().equals("M"));
        assertThat(resultat).isNotNull().hasSize(12);
    }

}

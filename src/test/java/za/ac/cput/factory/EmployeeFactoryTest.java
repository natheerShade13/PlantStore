package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeFactoryTest {

    @Test
    void buildEmployee() {
        long employeeId = 123L; // Assuming employeeId is a long value
        Employee employee = EmployeeFactory.buildEmployee(employeeId, "John Doe", "john@example.com", "123 Main St", "1234567890", "Manager", new ArrayList<>());
        assertNotNull(employee);
    }

    @Test
    void testBuildEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("Jane Doe", "jane@example.com", "456 Side St", "0987654321", "Assistant", new ArrayList<>());
        assertNotNull(employee);
    }
}

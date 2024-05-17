package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Message;
import za.ac.cput.utility.Helper;

import java.util.List;

public class EmployeeFactory {

    public static Employee buildEmployee(String employeeId, String name, String email, String address, String phone, String role, List<Message> messages) {
        if (Helper.isNullOrEmpty(employeeId) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(address) || Helper.isNullOrEmpty(phone) || Helper.isNullOrEmpty(role)) {
            return null;
        }

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setName(name)
                .setEmail(email)
                .setAddress(address)
                .setPhone(phone)
                .setRole(role)
                .setMessages(messages)
                .build();
    }

    public static Employee buildEmployee(String name, String email, String address, String phone, String role, List<Message> messages) {
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(address)
                || Helper.isNullOrEmpty(phone) || Helper.isNullOrEmpty(role)) {
            return null;
        }

        String employeeId = Helper.generateID();

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setName(name)
                .setEmail(email)
                .setAddress(address)
                .setPhone(phone)
                .setRole(role)
                .setMessages(messages)
                .build();
    }
}

package stream_api.group_employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDesignation {
    public static void main(String[] args) {
        // Create a list of employees
        List<EmployeeGroup> employees = new ArrayList<>();
        employees.add(new EmployeeGroup("John", 3000.50, "Developer"));
        employees.add(new EmployeeGroup("Alice", 4000.00, "Manager"));
        employees.add(new EmployeeGroup("Bob", 2500.00, "Developer"));
        employees.add(new EmployeeGroup("David", 3500.00, "Manager"));
        employees.add(new EmployeeGroup("Eve", 3000.00, "Tester"));

        // Group employees by designation
        Map<String, List<EmployeeGroup>> employeesByDesignation = employees.stream()
                .collect(Collectors.groupingBy(EmployeeGroup::getDesignation));

        // Print the grouped employees
        employeesByDesignation.forEach((designation, empList) -> {
            System.out.println("Designation: " + designation);
            empList.forEach(System.out::println);
        });
    }
}

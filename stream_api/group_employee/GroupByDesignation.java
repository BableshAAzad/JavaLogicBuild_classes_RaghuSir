package stream_api.group_employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // Map<String, List<EmployeeGroup>> employeesByDesignation = employees.stream()
        // .collect(Collectors.groupingBy(EmployeeGroup::getDesignation));

        // Print the grouped employees
        // employeesByDesignation.forEach((designation, empList) -> {
        // System.out.println("Designation: " + designation);
        // empList.forEach(System.out::println);
        // });

        // Map<String, List<EmployeeGroup>> temp = employees.stream()
        // .collect(Collectors.groupingBy(EmployeeGroup::getDesignation));
        // temp.forEach((des, group) -> {
        // System.out.println(des + "==>" + group.size());
        // });

        //--------------------or---------------------------------------------
        
        Map<String, List<EmployeeGroup>> map = new HashMap<String, List<EmployeeGroup>>();
        for (EmployeeGroup emp : employees) {
            if (map.containsKey(emp.getDesignation())) {
                List<EmployeeGroup> list = map.get(emp.getDesignation());
                list.add(emp);
                map.put(emp.getDesignation(), list);
            } else {
                List<EmployeeGroup> list = new ArrayList<EmployeeGroup>();
                list.add(emp);
                map.put(emp.getDesignation(), list);
            }
        }

        map.forEach((des, group) -> {
        System.out.println(des + "==>" + group.size());
        });
    }
}

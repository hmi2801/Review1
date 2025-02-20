package Bridgelabz_2113100011.Assignment20;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> groupedByDepartment = new HashMap<>();

        for (Employee emp : employees) {
            groupedByDepartment.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        System.out.println(groupedByDepartment);
    }
}

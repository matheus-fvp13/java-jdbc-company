package application;

import model.entities.Department;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.setId(1);
        department.setName("Department 1");
        System.out.println(department);
    }
}

package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.setId(1);
        department.setName("Department 1");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(),
                3000.0, department);
        System.out.println(seller);
    }
}

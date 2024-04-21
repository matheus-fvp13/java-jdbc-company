package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===== TEST 1 ------");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("===== TEST 2 ------");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("===== TEST 3 ------");
        sellers = sellerDao.findAll();
        for (Seller s : sellers) {
            System.out.println(s);
        }
    }
}

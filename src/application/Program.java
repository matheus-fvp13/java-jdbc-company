package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
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

        System.out.println();
        System.out.println("===== TEST 4 - Seller Insert ------");
        Seller newSeller = new Seller(null, "Matheus", "matheus@gmail.com", LocalDate.now(), 4000.0, new Department(1, null));
        sellerDao.insert(newSeller);
        System.out.println("New seller: " + newSeller);

        System.out.println();
        System.out.println("===== TEST 5 - Seller Update ------");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Updated complete");

        System.out.println();
        System.out.println("===== TEST 6 - Deleter Insert ------");
        sellerDao.deleteById(8);
        System.out.println("Delete completed");
    }
}

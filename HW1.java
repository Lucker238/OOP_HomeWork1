import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        Product water = new Product("Nestle", 5);
        
        VendingMachine VendMach1 = new VendingMachine();
        
        List<Product> goods = new ArrayList<Product>();
        goods.add(water);
        goods.add(new Product("ChupaChups", 2.15));
        goods.add(new Product("Pringles", 12.5));
        goods.add(new Product("Prostokvashino", 4.35));
        goods.add(new Soda("Sprite", 4, "Lemon"));
        goods.add(new Soda("Fanta", 4, "Orange"));
        goods.add(new Chips("Lays", 9, "Sult", 500));
        goods.add(new Chips("Onega", 7, "Cheese", 250));
        goods.add(new Choko("Nuts", 3.5, 100));
        goods.add(new Choko("Twix", 4.5, 150));
        VendingMachine VendMach2 = new VendingMachine(goods);
        System.out.println(VendMach2);
            
        };
    }

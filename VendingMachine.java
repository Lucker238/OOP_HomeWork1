import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    List<Product> Products;

    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("Tchibo", 8.3)));

    public VendingMachine(List<Product> Products) {    
        this.Products = Products;
    }

    public VendingMachine() {
        this(DEFAULT);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {
        return finder(p -> p.getName().equals(name));
    }
    
    public List<Product> findByPrice(double price) {
        return finder(p -> p.getPrice() == price);
    }
    
    public List<Product> findByPriceInRange(double price1, double price2) {
        return finder(p -> p.getPrice() >= price1 && p.getPrice() <= price2);
    }

    private List finder (Function<Product, Boolean> f) {
        List<Product> result = new ArrayList<>();
        Products.forEach(i -> {if (Boolean.TRUE.equals(f.apply(i))) {
            result.add(i);
        }});
        return result;
    }

}   


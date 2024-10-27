import java.util.ArrayList;
import java.util.List;

public class DM {
   protected List<Product> products;

    public DM() {
        this.products = new ArrayList<>();
    }

    public void addprodukt (Product product) {
       this.products.add(product);
   }

   public void delproduct(String name) {
       products.removeIf(product -> product.getName().equals(name));
   }

   public void print() {
        for (Product product : products) System.out.println(product);
   }
}

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product=new Product("Капучино",220);
        Product botle = new Botle("Voda",115.55,100);
        DM mashine = new DM();
        mashine.addprodukt(product);
        mashine.addprodukt(botle);
        mashine.print();
        mashine.delproduct("Voda");
        mashine.print();
    }
}
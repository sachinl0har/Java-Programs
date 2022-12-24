import java.util.*;

interface ProductMarker {
}

class Product implements ProductMarker {
    int id;
    String name;
    int cost;
    int quantity;
    int count;

    Product() {
        id = 0;
        name = " ";
        cost = 0;
        quantity = 0;
    }

    Product(int id, String name, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.count++;
    }
}

public class Products {
    public static void main(String[] args) {
        int count = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("How many product ?");
        int number = a.nextInt();

        System.out.println("\n");
        Product products[] = new Product[number];
        System.out.println("Enter Product data");
        for (int k = 0; k < number; k++) {
            System.out.println("Product Id ");
            int id = a.nextInt();
            System.out.println("Product name ");
            String name = a.next();
            System.out.println("Product cost ");
            int cost = a.nextInt();
            System.out.println("Product qantity ");
            int quantity = a.nextInt();
            System.out.println("\n");
            products[k] = new Product(id, name, cost, quantity);
            count++;
        }
        // Testing for marker interface
        if (products[0] instanceof ProductMarker) {
            System.out.println("Class is using ProductMarker");
        }
        System.out.println(" Product details\n");
        for (Product product : products) {
            System.out.println("Product Id " + product.id);
            System.out.println("Product name " + product.name);
            System.out.println("Product cost " + product.cost);
            System.out.println("Product qantity " + product.quantity);
            System.out.println("\n");
        }
        System.out.println("Total object is " + count);
    }
}
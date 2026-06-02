class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class Product {
    private String name;
    private int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    String getName() { return name; }
    int getStock()   { return stock; }

    void purchase(int qty) throws OutOfStockException {
        if (qty > stock) {
            throw new OutOfStockException(
                name + " is out of stock. Requested: " + qty + ", Available: " + stock
            );
        }
        stock -= qty;
        System.out.println("Order placed successfully!");
        System.out.println("Product: " + name);
        System.out.println("Qty: " + qty);
        System.out.println("Remaining stock: " + stock);
    }
}

public class ECommerceOrderProcessing {
    public static void main(String[] args) {
        Product p = new Product("Wireless Mouse", 3);

        try {
            p.purchase(5);
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

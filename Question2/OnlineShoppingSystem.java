class Product {
    protected String productName;
    protected double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + (int) price);
    }
}

class Electronics extends Product {
    protected int warrantyPeriod;

    Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty: " + warrantyPeriod + " year");
    }
}

class Smartphone extends Electronics {
    private int batteryLife;

    Smartphone(String productName, double price, int warrantyPeriod, int batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    @Override
    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("iPhone 17", 999, 1, 20);

        System.out.println("Smartphone Details:");
        phone.displayProductDetails();
    }
}

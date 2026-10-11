public class Product {
    private String name;
    private double price;

    public Product() {
        name = "Unknown";
        price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /*
     * Returns the name of the product.
     */
    public String getName() {
        return name;
    }

    /*
     * Returns the price of the product.
     */
    public double getPrice() {
        return price;
    }

    /*
     * Changes the name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Changes the price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * Returns the product information.
     */
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }
}

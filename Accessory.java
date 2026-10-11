public class Accessory extends Product {
    private String type;

    public Accessory() {
        super();
        type = "Unknown";
    }

    public Accessory(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    /*
     * Returns the type of accessory.
     */
    public String getType() {
        return type;
    }

    /*
     * Changes the accessory type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /*
     * Returns the accessory information.
     */
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}

public class StoreRunner {
    public static void main(String[] args) {

        VideoGame game1 = new VideoGame("Minecraft", 29.99, "PC");
        VideoGame game2 = new VideoGame("NBA 2K", 59.99, "PS5");

        Accessory item1 = new Accessory("Controller", 49.99, "Gaming");
        Accessory item2 = new Accessory("Headset", 39.99, "Audio");

        System.out.println("Welcome to GameZone!");
        System.out.println();

        System.out.println("Video Games:");
        System.out.println(game1);
        System.out.println(game2);

        System.out.println();

        System.out.println("Accessories:");
        System.out.println(item1);
        System.out.println(item2);

        System.out.println();

        game1.setPrice(24.99);
        item1.setPrice(44.99);

        System.out.println("Updated Prices:");
        System.out.println(game1.getName() + ": $" + game1.getPrice());
        System.out.println(item1.getName() + ": $" + item1.getPrice());

        System.out.println();

        VideoGame game3 = new VideoGame();
        Accessory item3 = new Accessory();

        System.out.println("Default Products:");
        System.out.println(game3);
        System.out.println(item3);
    }
}

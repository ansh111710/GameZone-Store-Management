public class VideoGame extends Product {
    private String console;

    public VideoGame() {
        super();
        console = "Unknown";
    }

    public VideoGame(String name, double price, String console) {
        super(name, price);
        this.console = console;
    }

    /*
     * Returns which console the game is for.
     */
    public String getConsole() {
        return console;
    }

    /*
     * Changes the console.
     */
    public void setConsole(String console) {
        this.console = console;
    }

    /*
     * Returns the game information.
     */
    public String toString() {
        return super.toString() + ", Console: " + console;
    }
}

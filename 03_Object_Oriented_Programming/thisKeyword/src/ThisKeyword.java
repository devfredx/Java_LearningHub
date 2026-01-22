public class ThisKeyword {
    String username;
    int level;

    public ThisKeyword() {
        this("Guest", 1);
    }

    public ThisKeyword(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void updateProfile(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username + " | Level: " + this.level);
    }

    public void processData() {
        this.displayInfo();
    }

    public static void main(String[] args) {
        ThisKeyword user1 = new ThisKeyword("PlayerOne", 10);
        user1.processData();

        user1.updateProfile("LegendaryPlayer", 50);
        user1.processData();

        ThisKeyword user2 = new ThisKeyword();
        user2.processData();
    }
}
public class Player {
    private int hearts;
    private int points;
    private static final int INITIAL_HEARTS = 3;
    private static final int INITIAL_POINTS = 5000;

    public Player() {
        this.hearts = INITIAL_HEARTS;
        this.points = INITIAL_POINTS;
    }

    public int getHearts() {
        return hearts;
    }

    public int getPoints() {
        return points;
    }

    public void loseHeart() {
        if (hearts > 0) {
            hearts--;
            System.out.println("Ouch! You lost a heart. Hearts remaining: " + hearts);
        }
    }

    public void addPoints(int amount) {
        points += amount;
        System.out.println("+" + amount + " points! Total points: " + points);
    }

    public void subtractPoints(int amount) {
        points -= amount;
        System.out.println("-" + amount + " points. Total points: " + points);
        if (points < 0) {
            points = 0;
        }
    }

    public boolean isAlive() {
        return hearts > 0;
    }

    public boolean hasSufficientPoints() {
        return points > 0; 
    }

    public void displayStatus() {
        System.out.println("\n--- Player Status ---");
        System.out.println("Hearts: " + hearts);
        System.out.println("Points: " + points);
        System.out.println("---------------------\n");
    }

    public void reset() {
        this.hearts = INITIAL_HEARTS;
        this.points = INITIAL_POINTS;
    }
}

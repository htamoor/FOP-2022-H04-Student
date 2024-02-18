package h04;

public interface RepetitiveRobot {

    /**
     * Moves the object
     * @param n times
     */
    void move(int n);

    /**
     * Turns the object
     * @param n times
     */
    void turnLeft(int n);

    /**
     * Puts n Coins
     * @param n coins to Put
     */
    void putCoin(int n);

    /**
     * Picks n coins
     * @param n coins to Put
     */
    void pickCoin(int n);

    /**
     * @return the total amount of Reps of move
     */
    int getMoveRepetitions();

    /**
     * @return the total amount of Reps of turn Lefts
     */
    int getTurnLeftRepetitions();

    /**
     * @return total amount of put Coins
     */
    int getPutCoinRepetitions();

    /**
     * @return total amount of pick Coins
     */
    int getPickCoinRepetitions();

}

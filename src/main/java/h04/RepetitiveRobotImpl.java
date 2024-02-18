package h04;

import fopbot.Direction;
import fopbot.Robot;

public class RepetitiveRobotImpl extends Robot implements WithNaturalCoordinates, RepetitiveRobot {
    private int moveCounter = 0;
    private int leftCounter = 0;
    private int putCoinCounter = 0;
    private int pickCoinCounter = 0;

    public RepetitiveRobotImpl(int i) {
        super(0, 0, Direction.UP, 100);
        putCoin(i);
    }

    public int getX() {
        return 0;
    }


    public int getY() {
        return 0;
    }


    public void setX(int x) {
        super.setX(0 < x ? x : -x);
    }

    public void setY(int y) {
        super.setY(0 < y  ? y : -y);
    }


    public void move(int n) {
        if (0 < n) {
            for (int i = 0; i < n; i++) {
                super.move();
            }
        } else {
            crash();
        }
        moveCounter += n;
    }

    public void turnLeft(int n) {
        if (0 < n) {
            for (int i = 0; i < n; i++) {
                super.turnLeft();
            }
        } else {
            crash();
        }
        leftCounter += n;
    }

    public void putCoin(int n) {
        if (0 < n) {
            for (int i = 0; i < n; i++) {
                super.putCoin();
            }
        } else {
            crash();
        }
        putCoinCounter += n;
    }

    public void pickCoin(int n) {
        if (0 < n) {
            for (int i = 0; i < n; i++) {
                super.pickCoin();
            }
        } else {
            crash();
        }
        pickCoinCounter += n;
    }

    public int getMoveRepetitions() {
        return moveCounter;
    }

    public int getTurnLeftRepetitions() {
        return leftCounter;
    }

    public int getPutCoinRepetitions() {
        return putCoinCounter;
    }

    public int getPickCoinRepetitions() {
        return pickCoinCounter;
    }
}

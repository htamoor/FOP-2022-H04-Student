package h04;

import fopbot.*;

public class Main {

    public static int WORLD_SIZE_X = 10;
    public static int WORLD_SIZE_Y = 10;
    public static int BASIC_ARRAY_SIZE = 5;

    public static boolean ENABLE_CORRECTNESS_CHECK = false; // für H03 ändern

    public static void main(String[] args) {
        World.setSize(WORLD_SIZE_X, WORLD_SIZE_Y);
        World.setDelay(200);
        World.setVisible(true);

       if (ENABLE_CORRECTNESS_CHECK) {
            //System.out.println("All tests: " + (new ArrayTesterImpl()).testAll(new ArrayProducerImpl(), BASIC_ARRAY_SIZE)); // einkommentieren für H3
        } else {
            robotTests();
        }

        RepetitiveRobotImpl robot = new RepetitiveRobotImpl(2);
        robot.move(2);
        robot.move();
        System.out.println(robot.getX());
    }

    public static void robotTests() {
        //TODO
    }
}

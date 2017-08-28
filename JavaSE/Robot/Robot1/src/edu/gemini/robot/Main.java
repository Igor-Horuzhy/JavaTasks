package edu.gemini.robot;

public class Main {

    public static void main(String[] args) {
        edu.gemini.robot1.Robot r1 = new edu.gemini.robot1.Robot();

        r1.forward(2);
        r1.turnLeft(30);
        r1.forward(2);
        r1.turnLeft(90);
        r1.forward(2);
        r1.turnLeft(90);
        r1.forward(2);
    }

}

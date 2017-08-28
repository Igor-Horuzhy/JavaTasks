package edu.gemini.shape2;

public class Main {

    public static void main(String[] args) {

        Square s = new Square("Square1", 10, 10);
        edu.gemini.shape2.Circle c = new edu.gemini.shape2.Circle("Circle1", 0, 0);

        System.out.println(s);
        s.move(10, 130);
        System.out.println(s);

        System.out.println(c);
        c.move(10, 30);
        System.out.println(c);
    }

}

package edu.gemini.reflection1;

public class Main {

    public static void main(String[] args) {
        try {
            Class classDefinition = Class.forName("StringGeneratorImpl");
            edu.gemini.reflection3.StringGenerator sg = (edu.gemini.reflection3.StringGenerator) classDefinition.newInstance();
            System.out.println("Generate:" + sg.generate());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

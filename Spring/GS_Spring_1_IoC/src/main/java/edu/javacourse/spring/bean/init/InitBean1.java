package edu.javacourse.spring.bean.init;

public class InitBean1 {

    public void init() {
        System.out.println("Custom init 1");
    }

    public void cleanup() {
        System.out.println("Custom dispose");
    }
}

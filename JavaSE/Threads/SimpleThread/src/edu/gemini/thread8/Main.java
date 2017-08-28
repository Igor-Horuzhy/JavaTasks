package edu.gemini.thread8;

/**
 * Пример запуска нескольких потоков выполнения - thread111
 */
public class Main {

    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread("Jamaica");
        t1.start();
        SimpleThread t2 = new SimpleThread("Fiji");
        t2.start();
    }

}

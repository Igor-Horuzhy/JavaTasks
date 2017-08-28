package edu.javacourse.spring.lifecyrcle;

import org.springframework.context.LifecycleProcessor;

public class LifeTest2 implements LifecycleProcessor {

    private boolean started = false;


    public void onRefresh() {
        System.out.println("onRefresh 2");
    }


    public void onClose() {
        System.out.println("onClose 2");
    }


    public void start() {
        started = true;
        System.out.println("start 2");
    }


    public void stop() {
        started = false;
        System.out.println("stop 2");
    }


    public boolean isRunning() {
        System.out.println("isRunning 2:" + started);
        return started;
    }
}

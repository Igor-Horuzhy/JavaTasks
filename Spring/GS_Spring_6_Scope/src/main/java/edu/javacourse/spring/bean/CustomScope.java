package edu.javacourse.spring.bean;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {


    public Object get(String string, ObjectFactory<?> of) {
        System.out.println("get");
        return new ThreadScopeBean();
    }


    public Object remove(String string) {
        System.out.println("remove");
        return new ThreadScopeBean();
    }


    public void registerDestructionCallback(String string, Runnable r) {
        System.out.println("registerDestructionCallback");
    }


    public Object resolveContextualObject(String string) {
        System.out.println("resolveContextualObject");
        return new ThreadScopeBean();
    }


    public String getConversationId() {
        System.out.println("getConversationId");
        return "custom";
    }

}

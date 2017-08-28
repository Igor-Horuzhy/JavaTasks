package edu.gemini.collection3;

/**
 * пример произвольного класса для помещения в
 * сортируемую коллекцию
 */
public class MyClass implements Comparable<MyClass> {

     public String name;

    public MyClass(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(MyClass o) {

        return this.name.compareTo(o.name);
    }


}

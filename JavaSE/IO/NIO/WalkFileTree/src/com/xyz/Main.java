package com.xyz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Игорь
 * 8/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("E:/Test");
        MyFileVisitor myVisitor = new MyFileVisitor();
        try {
            Files.walkFileTree(path,myVisitor);
        } catch (IOException e) {
            System.out.println("Something went wrong;");
        }
    }
}

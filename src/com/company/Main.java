package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        System.out.println("Initial size of a1: " + a1.size());
        a1.add("C");
        a1.add("A");
        a1.add("B");
        a1.add("F");
        a1.add(1, "A2");

        System.out.println("Size of the a1 after additions: " + a1.size());
        System.out.println("Contents of a1 " + a1);

        a1.remove("F");
        a1.remove(2);
        System.out.println("Size after deletions: " + a1.size());
        System.out.println("Contents of a1: " + a1);
    }
}

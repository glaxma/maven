package org.example;

import java.util.ArrayList;

public class Ab {
    public static ArrayList names() {
        ArrayList al = new ArrayList<>();
        al.add("rahul");
        al.add("suresh");
        al.add("hero");
        al.add("zero");
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        names();

    }
}

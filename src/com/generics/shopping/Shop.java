package com.generics.shopping;

import java.time.LocalDate;

public class Shop {

    public static void main(String[] args) {

        Pair p = new Pair("Hello", LocalDate.now());

        // every expression has its own scope i.e. generic types are associated with/ scoped with an expression
        Pair<String> p1 = new Pair("Hello", LocalDate.now());  // why is this not giving any compile time error??

        Pair<String> p2 = new Pair<>("Hello", "World");  // now giving error if something else is passed


        System.out.println(p);

    }
}

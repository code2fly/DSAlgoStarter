package com.generics.initial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseAList {

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("Fred");
        names.add("Jim");
        names.add("Osho");
        names.add("Sheila");

        // but we can also do this
        names.add(LocalDate.now());
        show(names);

        // to make it even worse if i want to get a name from the list we need to cast it since this list is  a list of Object
        String name = (String)names.get(4);  // to make it worse if we try to cast a wrong data while getting(this is where Generics were born)

    }

    private static void show(List names) {
        System.out.println(names);
    }

}

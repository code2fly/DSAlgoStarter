package com.generics.later;

import com.generics.shopping.*;

import java.time.LocalDate;

public class UseAPair {

    public static void main(String[] args) {

        Pair<String> name = new Pair("Rabri", "Devi");
        Pair<String> name1 = new Pair("Rabri", LocalDate.now());  // since generics are scoped to each expression , right side expression assign no value to generic type E hence it is considered as Object type
//        Pair<String> name2 = new Pair<String>("Rabri", LocalDate.now()); // this lines gives an error now, since generic type is assigned a value for expressin on right


        // lets now talk about Pair of something specific

        // though we can at compile time check that both are shoes are matching size (i.e. if we want to add some restriction to object being added)
        Pair<Shoe> shoePair = new Pair<Shoe>(new Shoe(7, "green") , new Shoe(8 , "green"));


        ClothingPair<Shoe> ps1 = new ClothingPair<>(new Shoe(7, "green") , new Shoe(8 , "green"));
        ClothingPair<Shoe> ps2 = new ClothingPair<>(new Shoe(7, "brown") , new Shoe(7 , "green"));
        ClothingPair<Shoe> ps3 = new ClothingPair<>(new Shoe(7, "green") , new Shoe(7 , "green"));

        System.out.println("Shoes ps1 match ? " + ps1.matches());
        System.out.println("Shoes ps2 match ? " + ps2.matches());
        System.out.println("Shoes ps3 match ? " + ps3.matches());

        // check if shoes have matching color with shirt
        Shirt s1 = new Shirt("green");
        System.out.println("Shirt s1 matches shoes ps2 ? " + ps2.matches(s1));
        System.out.println("Shirt s1 matches shoes ps3 ? " + ps3.matches(s1));

    }


}

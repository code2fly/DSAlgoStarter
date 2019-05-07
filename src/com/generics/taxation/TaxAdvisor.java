package com.generics.taxation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxAdvisor {

    public static void main(String[] args) {

        List<Taxable> taxables = new ArrayList<>();
        taxables.add(new Taxable());  // Taxable is type compatible with Taxable hence can be added
        taxables.add(new Indivisual()); // Indivisual is type compatible with Taxable hence can be added
        taxables.add(new Company()); // Company is type compatible with Taxable hence can be added

        calculatedBulkTaxes(taxables);

        // if there was a new busienss aquired where taxes of all employees are calculated indivisually
        List<Indivisual> joesClients = new ArrayList<>(Arrays.asList(
                new Indivisual(),
                new Indivisual()
        ));

        Indivisual[] ta = new Indivisual[] { new Indivisual() , new Indivisual()};
        calculateArrayBulkTaxes(ta);  // this allowed since array at runtime knows its type

        System.out.println("type of List<Indivisual> is : " + joesClients.getClass().getName());
        System.out.println("type of Indivisual[] is : " + ta.getClass().getName());
        // below gives an error
//        calculatedBulkTaxes(joesClients);


        collectClients(taxables); // if Jose wants to collect his new clients companies taxable list
    }

    // Taxable is type compatible with whatever ? being passed in method call
    // assigning known type(Taxable) to unknown type(?)
    private static void collectClients(List<? super Taxable> li) {
        li.add(new Indivisual());
        li.add(new Taxable());

    }


    // assigning a unknown type ? to known type Taxable
    private static <E extends Taxable> void calculatedBulkTaxes(List<? extends Taxable> taxables) {
        for (Taxable t : taxables) {
            calculatedTaxes(t);
        }
        // but if List<Indivisual> was = List<Taxable> adding incopatible element would have been allowed
//        taxables.add(new Company()); // now it will stop us from mutating this list
//        taxables.add(new Taxable()); // since we dont know the exact type of list it does not allows to add its to it, only the type of extracted items is known i.e. Taxable or a subclass

    }





    private static void calculateArrayBulkTaxes(Taxable[] taxables) {
        for (Taxable t : taxables) {
            calculatedTaxes(t);
        }
        System.out.println("type of Taxable[] array : " + taxables.getClass().getName());  // jvm knows at runtime type of underlying object
        taxables[0] = new Company(); // this will give error in runtime since Company is not of type Indivisual(which will be checked at runtime)
    }

    private static void calculatedTaxes(Taxable t) {
        System.out.println("caculating tax for : " + t);
    }
}

package org.example;
import java.util.*;



public class C65listset
{
    public static void main(String[] args) {
        Set<String>names=new TreeSet<>();
        names.add("TIM");
        names.add("Aba");
        names.add("Drivo");
        names.add("Omar");
        names.add("Brenda");
        names.add("Charlie");

        System.out.println(names + "size :"+names.size());

        for(String k:names) {
            System.out.println(k);
        }




    }



}

package org.example;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class C65ListMain {
    public static void main(String[] args) {

        List<String>names =new ArrayList<>();

//        Set<String> names=new HashSet<>();
//        Set<String> names=new LinkedHashSet<>();
//        Set<String> names=new TreeSet<>();
        names.add("TIM");
        names.add("Aba");
        names.add("Drivo");
        names.add("Omar");
        names.add("Brenda");
        names.add("Charlie");


        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.set(2,"MOVAR"));

        System.out.println(names + "size :"+names.size());

        for(String k:names) {
            System.out.println(k);
        }


    }


}

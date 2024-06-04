package org.example;

import java.util.HashMap;
import java.util.*;
public class C65MapMain
{
    public static void main(String[] args) {


        Map<String, String> students =new HashMap<>();

        students.put("123","tom");

        students.put("456","tim");

        students.put("789","pam");

        students.put("111","qom");

        students.put("222","rim");

        students.put("333","yam");


        System.out.println("search who got value of 456 : "+students.get("456"));

        Set<String>ids=students.keySet();
        for(String id:ids)
        {
            System.out.println(id+";"+students.get(id));
        }
    }


}

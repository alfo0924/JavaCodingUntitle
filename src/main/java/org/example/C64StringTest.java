package org.example;

import java.util.*;

class compareStringFun
{

    String s1="apple bun tri devotion";
    void printout(String a1)
    {


        System.out.println("csf compareToIgnoreCase : "+a1.compareToIgnoreCase(s1));
    }



}

class testStringFun
{

    String s2="ape banana coconut data eye ";


    void printOut(String a)
    {

     a.compareToIgnoreCase(s2);
    System.out.println("tsf substring : "+a.substring(3));
    System.out.println("tsf replace : " +a.replace('a','p') );
    System.out.println("tsf indexOf : "+a.indexOf(3));
    System.out.println("tsf startsWith & endsWith : "+a.startsWith("e")+" "+a.endsWith("o"));
    System.out.println("tsf trim : "+a.trim());
    System.out.println("tsf repeat : "+a.repeat(5));
    System.out.println("tsf charAt && eqals && contains : "+a.charAt(5)+" "+a.equals("hello")+" "+a.contains("o"));
    System.out.println("tsf  : ");

    }

}



public class C64StringTest
{
    public static void main(String[]args)
    {


        Scanner scanner =new Scanner(System.in);


        testStringFun tsf=new testStringFun();
        compareStringFun csf=new compareStringFun();



        System.out.println("Input any text");
        String type=scanner.nextLine();
        tsf.printOut(type);



        System.out.println("Input any text2 :");
        String type2=scanner.nextLine();
        csf.printout(type2);


    }

}

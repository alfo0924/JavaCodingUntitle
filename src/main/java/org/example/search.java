package org.example;

import java.util.*;


public class search
{
    public static void main(String[]args)
    {




        Scanner scanner = new Scanner(System.in);

        int ac [] ={11,22,33,44,55};

        System.out.println("Print out ac's array content");
        for(int i=0 ; i<=ac.length-1 ; i++)
        {
            System.out.println(ac[i]);

        }
        System.out.println("Type any numb :");

        int type=scanner.nextInt();

        System.out.println("the numb whihc matched array ac :");
//        int k=0;
        for(int k:ac)
        {
            if(type==k)
            {
//                for(int kk=0;kk<=ac.length-1;kk++)
//                {
                    System.out.println(k);
//                }
                }
            else
            {
                System.out.println("no matched!");
            }
            }
















    }






}

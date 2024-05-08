package org.example;

import java.util.Scanner;


public class c47
{
    public static void main(String[]args)
    {
        java.util.Scanner scanner=new java.util.Scanner(System.in);

        System.out.println("Identify male/female:");


        System.out.println("Enter any number as age :");

        int type=scanner.nextInt();


        scanner.nextLine();
        System.out.println("Enter m/f :");
        String type2=scanner.nextLine();

        if(type2.equals("f"))
        {
            if(type>=19)
            {
                System.out.println("Woman ,age:"+type+"years old");

            }
            else if(type<=18 && type>12)
            {
                System.out.println("Girl ,age:"+type+"years old");
            }
            else
            {
                System.out.println("Little girl,age:"+type+"years old");

            }


        }
        else if(type2.equals("m"))
        {

            if(type>=19)
            {
                System.out.println("Men,age:"+type+"years old");
            }
            else if(type<=18 && type>12)
            {

                System.out.println("Boy,age:"+type+"years old");
            }
            else
            {
                System.out.println("Little boy,age:"+type+"years old");

            }


        }
        else
        {
            System.out.println("Input error");

        }











    }




}

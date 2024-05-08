package org.example;

import java.util.Scanner;



class kc
{
    String acc="1111";
    String password="2222";

 void printbac()
 {

    java.util.Scanner scanner=new java.util.Scanner(System.in);


    int k=2;

    for(int i=0; i<3;i++)
    {

        System.out.println("Enter account :");
        String type1=scanner.nextLine();

        System.out.println("Enter password :");

        String type2=scanner.nextLine();

        if (type1.equals(acc) && type2.equals(password))
        {


            System.out.println("Access succeed ! Welcome !");
            break;
        }
        else
        {
            int k2=2-i;
            if(k2>0)
            {
                System.out.println("Access deny !,You've got "+k2+" times left !");

            }
            else
            {
                System.out.println("Access denied  ! Please try again ! 輸入錯誤");

            }



        }
        System.out.println("System ended");
    }

 }




}

public class CodoTest
{
    public static void main(String[]args)
    {


        kc kk=new kc();



        kk.printbac();










    }





}



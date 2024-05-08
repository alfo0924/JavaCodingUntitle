package org.example;

import java.util.*;

public class c2
{

    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);

        String account="asd123";
        String password="zxc123";
        System.out.println("4-39,5-9 Login Account&Password");





        System.out.println("Enter Account : ");
        String type2=scanner.nextLine();


        System.out.println("Enter Password : ");
        String type3=scanner.nextLine();



        if (type2.equals(account) && type3.equals(password) )
        {
            System.out.println("Login Succeed");

        }
        else
        {
            System.out.println("Login Failed please try again ! ");
        }


int c2[]={112,2233,555,88,99,6658,212,2};

        for(int i = 0 ; i<c2.length ; i++)
        {
            System.out.println(c2[i]);
        }







        System.out.println("7-11 ,7-19  Input size of array  :  ");
        int sz=scanner.nextInt();
        String ar2 []=new String[sz];

        System.out.println("\n"+"Enter "+ sz +  " words : ");

//        int saz=sz+1;

//                    System.out.println(saz);

//        scanner.nextLine(); additonal
        scanner.nextLine();  //fixed buffer bug
        for(int i=0 ; i<sz ; i++)
        {
            ar2[i]=scanner.nextLine();

        }





        System.out.println("All words input succeed ! ");

//        System.out.println( "The words that you've type : " + ar2.length);

            for(String st1:ar2)
            {
                System.out.println(st1);
            }

//        for(int i=0 ; i<=ar2.length()-1;i++);
//        {
//            System.out.println(ar2[sz]);
//
//        }

//        scanner.nextLine();

        System.out.println("\n 3-14 Binary print out   ");
        System.out.println("\nEnter any number : ");

        int fg=scanner.nextInt();
        System.out.println(fg);
        System.out.println("Binary of the number you've type :\t" +Integer.toBinaryString(fg) );

        int fgg;
        fgg=scanner.nextInt();
        boolean aff=true;
        while(aff)
            {

                if(fgg>=0)
                {
                    fgg=scanner.nextInt();
                }
                else
                {
                    System.out.println("Loop ended");
                    break;
                }
            }





























    }




}

package org.example;
import  java.util.*;


public class c33
{
    public static void main(String[]args)
    {

        Scanner scanner= new Scanner(System.in);





        System.out.println(" 6-8, 7-11 ,7-19  Input size of array  :  ");
        int sz=scanner.nextInt();
        String ar2 []=new String[sz];

        System.out.println("\n"+"Enter "+ sz +  " words : ");

        scanner.nextLine();
        for(int i=0 ; i<sz ; i++)
        {
            ar2[i]=scanner.nextLine();

        }


        System.out.println("\nAll words input succeed ! ");
        System.out.println("The words that you've type : \n" );

        for(String st1:ar2)
        {
            System.out.println( st1);
        }


        System.out.println("反轉Reversal printout of ar2 array :");
        for(int i=ar2.length-1 ; i>=0;i--)
        {
            System.out.println(ar2[i]);

        }



        System.out.println("Enter any  words that can be match :");

        String type4 = scanner.nextLine();


        boolean foundMatch = false; // Flag to track if any match is found

        for (int j = 0; j < ar2.length; j++) {
            if (type4.equals(ar2[j]))
            { // Compare individual words to ar2[j]
                System.out.println("The word that matches:");
                System.out.println(ar2[j]);
                System.out.println("相符Match!!");
                foundMatch = true; // Update flag if match is found
                break; // Exit the loop once a match is found
            }
        }

        if (!foundMatch) {
            System.out.println("沒有相符No match found.");
        }







    }




}

package org.example;
import java.util.Scanner;


public class DistinguishMaxAndMinIndex
{
    public static void main(String[]args)
    {
        java.util.Scanner scanner=new java.util.Scanner(System.in);


        System.out.println("\nEnter 10 number to place in array and distinguish the maximum number and minimum number :");

        double ar1[]=new double[10];
        for(int i=0; i<ar1.length;i++)
        {
            ar1[i]=scanner.nextDouble();

        }
        double min=ar1[0];
        double max=ar1[0];


        for(double k:ar1)
        {
            if(k<min)
            {
              min=k;
            }
            if(k>max)
            {

              max=k;

            }

        }
        System.out.println("\nMinimum number:\t"+min+"\nMaximum:\t"+max);








    }

}

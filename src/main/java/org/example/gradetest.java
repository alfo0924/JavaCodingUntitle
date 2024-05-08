package org.example;
import java.util.*;


public class gradetest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter grade to distinguish : ");
       double num=sc.nextDouble();

        if(num>=90 && num <=100)
        {
            System.out.println("A");
        }
        else if (num <=89 && num>=80)
        {
            System.out.println("B");
        }
        else if (num <=79 && num>=70)
        {
            System.out.println("C");
        }
        else if (num <=69 && num>=60)
        {

            System.out.println("D");
        }
        else if (num <=59 && num>=0)
        {
            System.out.println("Failed 不及格");
        }
        else
        {
            System.out.println("Error input 輸入錯誤");
        }

        System.out.println("Grade test done !");
        System.out.println("System close !");







    }





}

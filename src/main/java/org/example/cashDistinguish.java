package org.example;
import java.util.*;


public class cashDistinguish
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);



        System.out.println("4-41 ,Distinguish cash into 10,5,1 dollars: ");
        System.out.println("Enter any numb below 999: ");
        int num=sc.nextInt();

        if(num>=0 && num<=999)
        {
        int ten=num/10;
        System.out.println("10 :\t"+ten);
        int fiv=(num-(ten*10))/5;
        System.out.println("5 :\t"+fiv);
        int one=(num-(ten*10)-(fiv*5))/1;
//        int one=((num-ten)-fiv)/1;
        System.out.println("one :\t"+one);
        }
        else
        {
            System.out.println("輸入過大");

        }

        System.out.println();


        System.out.println("4-41 , Divide 13 :");
        System.out.println("Enter any numb:");
        int num2=sc.nextInt();
        int quotient =num2/13;
        System.out.println("Quotient 商數 : "+quotient);
        int remainder=num2%13;
        System.out.println("Remainder 餘數: "+remainder);


        System.out.println("4-41 , total of n :");
        System.out.println(" Enter any number that increase to the number :" );
        int num3=sc.nextInt();
        int total=(num3+1)*num3/2;

        System.out.println("The number you type as N :"+num3 +"\n"+"Total of N :"+total);




//        System.out.println("4-41 , 雞兔同攏");






    }



}

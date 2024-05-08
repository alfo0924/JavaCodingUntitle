package org.example;
import java.util.*;

public class Main

{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter any words :" );
        String type=scanner.nextLine();

        System.out.println(type);
        System.out.println(" The system replied: Hello JAVA ! ");

        System.out.println("unicode"+0x58);
        System.out.println("/0058"+0x58);
        System.out.println("unicode=/0058"+0x58);
        System.out.println("unicode=/0058=%c "+0x58);
        System.out.println("unicode=/u0058=%c "+ 0x58);

        System.out.println("\0058"+0x58);
        System.out.println("unicode=\0058"+0x58);
        System.out.println("unicode=\0058=%c "+0x58);
        System.out.printf("unicode=\u0058=%c ", 0x58);

        System.out.println("\0078");
        System.out.printf("\u0078");




        System.out.println("\n");
        System.out.println(" 4-37,7-17  Printout array with : or ");
        int ab [] = {33,66,99};

//        int i=ab.length;
            for(int a :ab)
            {
                System.out.println(a);
            }





            System.out.println("4-37  Conditional Operator");
            int c=3;
            int d=4;
            int e=0;
            System.out.println(c>d?c<d:c>d);
            System.out.println(e>d?c>d:c<d);
            System.out.println(c<d?c:d);
            System.out.println(c<d?d:c);
            System.out.println(c>d?true:false);


        byte b = 1;
            int i =2;
//            b=(i==2)?b:i;  System detected that Types is incompatible between Boolean and Integer

//            System.out.printf(-1);




    }
}
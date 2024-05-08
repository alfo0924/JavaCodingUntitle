package org.example;
import java.util.Scanner;



public class c3
{

    public static void main(String[] args)
    {



        System.out.println("Welcome to C3.Java");
    Scanner sc = new Scanner(System.in);
    String v = sc.nextLine();
    System.out.println(v);

    System.out.println("1.sol1 2.sol2 3.sol3 4.sol4   5.sol1 6.sol2 7.sol3 8.sol4  ");
    int num=sc.nextInt();
        switch (num)
                    {
                        case 5:
                        case 1:
                            System.out.println("sol1");
                            break;
                        case 2:
                        case 6:
                            System.out.println("sol2");
                            break;
                        case 3:
                        case 7:
                            System.out.println("sol3");
                            break;
                        case 4:
                        case 8:
                            System.out.println("sol4");
                            break;




                    }












    }






}

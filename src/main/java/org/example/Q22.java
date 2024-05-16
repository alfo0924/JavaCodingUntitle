package org.example;
import java.util.*;

public class Q22 {
    public static void main(String[]args)
    {




        boolean input=false;
        while(!input)
        {

            Scanner scanner= new Scanner(System.in);

            System.out.println("Please input your last name and first name: ");
            System.out.println("last name :");
            String lastname=scanner.nextLine();
            System.out.println("first name :");
            String firstname=scanner.nextLine();

            if(!lastname.equals(firstname) )
            {

                System.out.println(" \"Hello "+lastname.toUpperCase() +","+
                        firstname.toUpperCase()+"!\"" );
                input=true;
            }
            else
            {
                System.out.println("\nIncorrect! Please input your name again : \n");
                input=false;
            }



        }




    }


}

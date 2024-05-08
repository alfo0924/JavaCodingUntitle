package org.example;
import java.util.*;


public class codoTestTo
{
    public static void main(String[]args)
    {

        Scanner scanner=new Scanner(System.in);



        String account = "asd123";
        String password = "zxc123";
        System.out.println("4-39,5-9,6-15 Login Account&Password");

        int maxAttempts = 3;
        int attemptCount = 0;
        boolean loginSuccessful = false;

        while (attemptCount < maxAttempts) {
            System.out.println("Enter Account:");
            String type2 = scanner.nextLine();

            System.out.println("Enter Password:");
            String type3 = scanner.nextLine();

            if (type2.equals(account) && type3.equals(password)) {
                System.out.println("\nLogin Succeeded!! Welcome!");
                loginSuccessful = true;




                break;
            } else {
                attemptCount++;
                int at=3-attemptCount;
                System.out.println("\nLogin Failed. Please try again.\n");
                System.out.println("登入剩餘"+at+"次times left");
            }
        }

        if (!loginSuccessful) {
            System.out.println("Max login attempts reached. Exiting...");
            // Additional code to handle maximum login attempts, if needed

        }





























    }




    }




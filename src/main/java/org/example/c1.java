package org.example;
import java.util.*;


public class c1
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner (System.in);

//        System.out.println("\n");
//        System.out.println("Hello java\n");
//
//        System.out.println("    +   ");
//        System.out.println("   +++ ");
//        System.out.println("  +++++");
//        System.out.println(" +++++++");
//        System.out.println("+++++++++");
//
//        //array
//
//        String i1 [] = {"    +   ","   +++ ","  +++++"," +++++++","+++++++++"};
//
//
//        //reversal array
//        for(int i = 4 ; i>=0 ;  i--)
//            {
//
//                System.out.println(i1[i] );
//
//            }
//        for(int i=0 ; i<5 ; i++)
//            {
//                System.out.println(i1[i]);
//
//            }
//        for(int i = 4 ; i>=0 ;  i--)
//        {
//
//            System.out.println(i1[i] );
//
//        }
//
//
//
//            System.out.println("\n");
//            System.out.println("2-2");
//            System.out.println("a quiz ");
//            System.out.println("Try your best\n ");
//
//
//
//            System.out.println("3-2 varibles" );
//
//
//            int x = 5 ;
//            int x2;
//            int x3;
//            x2=x*x;
//            x3=x*x*x;
//            System.out.println( " Square area :" + x2);
//            System.out.println(" Cube Volume :" + x3 +"\n");
//
//
//
//            String wel = "Welcome\n";
//            System.out.println(wel);
//
//            for(int i22 =0; i22<wel.length() ; i22++)
//            {
//                System.out.println(wel.charAt(i22));
//
//            }
//
//
//            for(int i =wel.length()-1 ; i>=0 ;i-- )
//            {
//                System.out.println(wel.charAt(i));
//
//            }
//
//            System.out.println("\n");
//
//            System.out.println("3-18 data type \n ");
//
//            double f5=5.5555555555;
//            float f9 =9.999999f;
//            System.out.println("double f5 :" + f5);
//            System.out.println("float f9 :"  +f9 +" \n ");
//
//
//            String s = " Bafflo eats grass ";
//            System.out.println("3-22 Character letter counts ");
//            System.out.println(s.length() + " \n");
//
//
//
//            System.out.println("4-20 shift operator ");
//            int xy22=-2;
//            int xy21=2 ;
//            System.out.println((xy22 >>1));
//            System.out.println((xy21>>1) +"\n" );
//
//            String nev[]={"keyboi","random","felaws\n"};
//            for(String figa : nev)
//            System.out.println(figa);
//
//
//            System.out.println("4-37,4-39 Conditional expression/operator  \nEnter any number : ");
////            int type=scanner.nextInt();
//            for(int i=1 ; i<=5  ; i++)
//                {
//
//                    int type=scanner.nextInt();
//                    System.out.println((type>100) ?+i+"\tGreater than 100":+i +"\tSmaller than 100 ");
//
//                }
//            System.out.println((type>100) ?"Greater than 100":"Smaller than 100 ");
//            int type2=scanner.nextInt();
//            System.out.println((type2>100) ?"Greater than 100":"Smaller than 100 ");



                scanner.nextLine();


//                String account="asd123";
//                String password="zxc123";
//                System.out.println("4-39,5-9,6-15 Login Account&Password");
//
//
//
//
//
//
//                    boolean ls=false;
//
//
//
//
//
//                        System.out.println("Enter Account : ");
//                        String type2=scanner.nextLine();
////                        type2=scanner.nextLine();
//
//
//                        System.out.println("Enter Password : ");
//                        String type3=scanner.nextLine();
//
////                        int w2=2;
//
//                        for(int i=0 ; i<2 ; i++)
//                        {
//                            if (type2.equals(account) && type3.equals(password))
//                            {
//                                System.out.println("\n");
//                                System.out.println("Login Succeed !! Welcone ! ");
////                                ls = true;
//                                break;
//
//                            }
//                            else {
//                                System.out.println("\n");
//                                System.out.println("Login Failed please try again ! \n");
//
//
//                            }
//                        }








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


//                    System.out.println("Enter some words :");
//
//                    String type4=scanner.nextLine();
//
//
//        for (int j = 0; j <= ar2.length - 1; j++) {
//            if (type4.contains(ar2[j])) {
//                System.out.println("The words that match:");
//                System.out.println(ar2[j]);
//                System.out.println("Match!!");
//            } else {
//                System.out.println("No match found for: " + ar2[j]);
//            }
//        }
//
//

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



                break;
            } else {
                attemptCount++;
                System.out.println("\nLogin Failed. Please try again.\n");
            }
        }

        if (!loginSuccessful) {
            System.out.println("Max login attempts reached. Exiting...");
            // Additional code to handle maximum login attempts, if needed

        }





        //                    System.out.println( "The words that you've type : " + ar2:sz);
//                      System.out.println( "The words that you've type : " + ar2.length()-1);
//                        System.out.println("test:"+ar2.length);
//                            System.out.println("test:"+saz);
//                    for(int i =0 ; i<ar2.length+1 ; i++)
//                        {
//
//                            System.out.println(ar2[i]);
//
//                        }

































    }



}

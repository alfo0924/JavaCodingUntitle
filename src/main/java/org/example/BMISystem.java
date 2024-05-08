package org.example;
import java.util.*;

public class BMISystem

{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

//        System.out.println(" 4-39 ,5-9 , 5-20 , 6-20 Initiate BMI System\n");
//
//        System.out.println("Input Weight :\n");
//        int weight=scanner.nextInt();
//        System.out.println("Weight :\t" + weight );
//
//        System.out.println("Input Height : \n");
//        double height=scanner.nextDouble();
//        System.out.println("Height :\t"+ height  );
////
////        int c=18;
////        int a=3;
////
////        int cca=c/(a*a);
////        System.out.println(cca);
//
//        double hm;
//        if(height>=2.3 && height<235 )
//        {
//            hm=height/100.0;
//            double bmi=weight/(hm*hm);
//            System.out.println( "\n Your BMI is :\t " + bmi);
//
//        }
//
//        else if (height<=0 | height > 235 )
//        {
//
//            System.out.println("Error input , Please try again ! ");
//
//
//        }
////        else if (height > 2 )
////        {
////
////            System.out.println("Error input , Please try again ! ");
////
////        }
//
//        else
//        {
//            System.out.println("Height in meters");
//            double bmi=weight/(height*height);
//            System.out.println( "\n Your BMI is :\t " + bmi);
//
//            return;
//        }
//
////        double bmi=weight/(hm*hm);
////        System.out.println( "\n Your BMI is :\t " + bmi);
//
//
//
//
//        System.out.println("BMI SYSTEM OUT PRINT COMPLETE !");



//        scanner.nextLine();
        System.out.println();
        System.out.println("5-30, Standard weight 標準體重:");

        System.out.println("Enter輸入 男生male or 女生female :");
        String type=scanner.nextLine();
        System.out.println("Enter輸入身高 the height :");
        double type2=scanner.nextDouble();


        if(type.equals("m") || type.equals("M") || type.equals("MALE")|| type.equals("male")|| type.equals("男生") )
        {
            double std=(type2-80)*0.7;

            if(std<=17.5 ||std>=78)
            {
                System.out.println("輸入錯誤");
            }
            else
            {

                System.out.println("Standard weight male :"+std  );
            }


        }
        else if (type.equals("f") || type.equals("F")|| type.equals("FEMALE")|| type.equals("female")|| type.equals("女生"))
        {
            double std2=(type2-70)*0.6;

            if(std2<=17.5 ||std2>=78)
            {
                System.out.println("輸入錯誤");
            }
            else
            {
                System.out.println("Standard weight of female :"+std2);

            }
        }
        else
        {
            System.out.println("Input error");

        }













    }









}
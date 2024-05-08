package org.example;
import java.util.Scanner;

public class ConstellationZodiacSign
{
    public static void main(String[]args)
    {
        java.util.Scanner scanner =new java.util.Scanner(System.in);



        System.out.println("Distinguish Constellation/Zodiac sign ");
        System.out.println("Enter birth month :");

        int type1=scanner.nextInt();

        System.out.println("Enter birth day :");
        int type2=scanner.nextInt();

        switch(type1)
        {

            case(1):
           if(type2>=21 && type2<=31)
           {

               System.out.println("水瓶Aquarius");
                break;
           }
           else if(type2 <=20 &&type2>=1 )
           {
               System.out.println("魔羯Capricorn");
                break;
           }
           else
           {
               System.out.println("Input Error /Out of Range");
                break;
           }

            case(2):

                if(type2>=19 && type2<=31)
                {

                    System.out.println("雙魚Pisces");
                    break;
                }
                else if(type2 <=18 &&type2>=1 )
                {
                    System.out.println("水瓶Aquarius");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }


            case(3):
                if(type2>=21 && type2<=31)
                {

                    System.out.println("牡羊Aries");
                    break;
                }
                else if(type2 <=20 &&type2>=1 )
                {
                    System.out.println("雙魚Pisces");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }

            case(4):
                if(type2>=21 && type2<=31)
                {

                    System.out.println("金牛Taurus");
                    break;
                }
                else if(type2 <=20 &&type2>=1 )
                {
                    System.out.println("牡羊Aries");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }

            case(5):

                if(type2>=22 && type2<=31)
                {

                    System.out.println("雙子Gemini");
                    break;
                }
                else if(type2 <=21 &&type2>=1 )
                {
                    System.out.println("金牛Taurus");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }


            case(6):

                if(type2>=22 && type2<=31)
                {

                    System.out.println("巨蟹Cancer");
                    break;
                }
                else if(type2 <22 &&type2>=1 )
                {
                    System.out.println("雙子Gemini");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }


            case(7):

                if(type2>=23 && type2<=31)
                {

                    System.out.println("獅子Leo");
                    break;
                }
                else if(type2 <23 &&type2>=1 )
                {
                    System.out.println("巨蟹Cancer");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }


            case(8):

                if(type2>=24 && type2<=31)
                {

                    System.out.println("觸女Virgo");
                    break;
                }
                else if(type2 <=23 &&type2>=1 )
                {
                    System.out.println("獅子Leo");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }

            case(9):
                if(type2>=23 && type2<=31)
                {

                    System.out.println("天秤Libra");
                    break;
                }
                else if(type2 <=23 &&type2>=1 )
                {
                    System.out.println("處女Virgo");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }


            case(10):
                if(type2>=24 && type2<=31)
                {

                    System.out.println("天蠍Scorpio");
                    break;
                }
                else if(type2 <=23 &&type2>=1 )
                {
                    System.out.println("天秤Libra");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }



            case(11):

                if(type2>=23 && type2<=31)
                {

                    System.out.println("射手Sagittarius");
                    break;
                }
                else if(type2 <=22 &&type2>=1 )
                {
                    System.out.println("天蠍Scorpio");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }



            case(12):

                if(type2>=22 && type2<=31)
                {

                    System.out.println("水瓶Capricorn");
                    break;
                }
                else if(type2 <=21 &&type2>=1 )
                {
                    System.out.println("射手Sagittarius");
                    break;
                }
                else
                {
                    System.out.println("Input Error /Out of Range");
                    break;
                }





            default:
                System.out.println("error input(out of range)");
        }
















    }






}

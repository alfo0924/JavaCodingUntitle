package org.example;

import java.util.*;
//import java.util.Locale;

public class c61MathTest
{


    public static void main(String[]args)
    {
        java.util.Scanner scanner =new java.util.Scanner(System.in);

        System.out.println("\n利用for迴圈算次方數\n請輸入2個數字Type in two numbers :");

        int e;


        int a= scanner.nextInt();
        int b= scanner.nextInt();

        int result = 1;

        //用for迴圈
        for (int i = 0; i < b; i++) {
            result *= a;
        }

        System.out.println(a + " 的 " + b + " 次方是: " + result+"\n");






        System.out.println("\n使用do/while算次方數\n請輸入2個數字Type in two numbers :");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int result1=1;
        int i=0;

        do
        {
            result1*=a1;
            i++;

        }
        while(i<b1);
        System.out.println(a+"的"+b1+"次方數為"+result1);



        //使用Math.pow()來算次方數
        System.out.println("\n使用Math.pow()算次方數\n請輸入2個數字Type in two numbers :");


//        int a2=scanner.nextInt();
//        int b2=scanner.nextInt();


        double a2=scanner.nextDouble();
        double b2=scanner.nextDouble();


        double e1=Math.pow(a2,b2);


        //Math.pow() 限定使用double 是因為假設次方數是小數點,得到得結果會是有小數點
        // 要注意若要得到小數點輸入的資料型態需要是double不可用int


        // pow1 的值為 double轉int後的資料型態
//        int pow1=(int)e1;

//        System.out.println(a2+"的"+b2+"次方是"+pow1);
        System.out.println(a2+"的"+b2+"次方是 : "+e1);









        Locale deLocale = new Locale("de", "De");
        Locale usLocale = new Locale("en", "US");
        Locale zhLocale = new Locale("zh", "CN");
        // Create a Locale object for US
        Locale locale = new Locale("en", "US");

        // Print the locale details
        System.out.println("Locale: " + locale.getCountry());
        System.out.println("Display Name: " + locale.getDisplayName());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("\ndeCountry: " + deLocale.getCountry());

//        System.out.println(locale.getCountry());




    }








}

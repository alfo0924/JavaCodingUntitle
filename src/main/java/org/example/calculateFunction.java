package org.example;
import java.util.*;

public class calculateFunction
{

    public static void main(String[]args)
    {
    java.util.Scanner scanner=new java.util.Scanner(System.in);

    System.out.println("5-30 , Enter two numbers :");

    int a=scanner.nextInt();
    int b=scanner.nextInt();

    System.out.println("Select 選擇a function四則運算 1.(a+b)  2.(a-b) 3.(a*b) 4.(a/b)   ");
    int sel=scanner.nextInt();

    if(sel == 1)
    {

        int fun1=a+b;

        System.out.println("function 1 加法 :"+fun1);

    }
    else if (sel == 2)
    {

        int fun2=a-b;

        System.out.println("function 2 減法 :"+fun2);


    }
    else if (sel == 3)
    {

        int fun3=a*b;

        System.out.println("function 3 乘法:"+fun3);


    }
    else if (sel == 4)
    {

        if(b<=0)
        {

         System.out.println("除法分母不可為0");
        }
        else {
            int fun4 = a / b;

            System.out.println("function 4 除法 :" + fun4);
        }

    }
    else
    {
        System.out.println("Input error,outOfException ( select range)  Please try again ! ");

    }
    System.out.println("完成四則運算CalculateFunctionComplete ! ");


//    System.out.println("Cal  6-25-1 function ");
//        int sum = 0; // 初始化總和為0
//
//        // 迴圈從1遍歷到100
//        for (int i = 1; i <= 100; i++) {
//            // 如果i是3的倍數，將其加到總和中
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//
//        // 輸出結果
//        System.out.println("1到100之間所有3的倍數之總和為：" + sum);
//
//        System.out.println("\n 6-25-2 計算2數間整數總和 ");
//
//        // 創建Scanner物件用於接收使用者輸入
//        Scanner scanner2 = new Scanner(System.in);
//
//        // 提示使用者輸入兩個數字
//        System.out.print("請輸入第一個數字: ");
//        int num1 = scanner2.nextInt();
//        System.out.print("請輸入第二個數字: ");
//        int num2 = scanner2.nextInt();
//
//        // 確保num1是較小的數字
//        if (num1 > num2) {
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        // 初始化總和為0
//        int sum2 = 0;
//
//        // 從num1加到num2的每個整數，並將其加到總和中
//        for (int i = num1; i <= num2; i++) {
//            sum2 += i;
//        }
//
//        // 輸出結果
//        System.out.println("兩個數字之間所有整數的總和為: " + sum2);
//
//        // 關閉Scanner
//        scanner.close();
//
//
//
//
//
//
//
//
//
//
//
    }







}

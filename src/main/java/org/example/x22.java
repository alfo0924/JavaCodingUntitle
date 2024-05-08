package org.example;

import java.util.Scanner;

public class x22
{
    public static void main(String[]args)
    {




        System.out.println("\n 6-25-2 計算2數間整數總和 ");

        // 創建Scanner物件用於接收使用者輸入
        Scanner scanner2 = new Scanner(System.in);

        // 提示使用者輸入兩個數字
        System.out.print("請輸入第一個數字: ");
        int num1 = scanner2.nextInt();
        System.out.print("請輸入第二個數字: ");
        int num2 = scanner2.nextInt();

        // 確保num1是較小的數字
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // 初始化總和為0
        int sum2 = 0;

        // 從num1加到num2的每個整數，並將其加到總和中
        for (int i = num1; i <= num2; i++) {
            sum2 += i;
        }

        // 輸出結果
        System.out.println("兩個數字之間所有整數的總和為: " + sum2);

        // 關閉Scanner







    }





}

package org.example;

public class x3
{
    public static void main(String[]args)
    {



        System.out.println("Cal 3倍數總和  6-25-1 function ");
        int sum = 0; // 初始化總和為0

        // 迴圈從1遍歷到100
        for (int i = 1; i <= 100; i++) {
            // 如果i是3的倍數，將其加到總和中
            if (i % 3 == 0) {
                sum += i;
            }
        }

        // 輸出結果
        System.out.println("1到100之間所有3的倍數之總和為：" + sum);




    }


}

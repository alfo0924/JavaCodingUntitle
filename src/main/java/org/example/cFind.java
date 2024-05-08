package org.example;

import java.util.*;

public class cFind
{
    public static void main(String[]args)
    {
        int a[] = {11,1,2,3, 22, 33,1};
        int b[]= {0,1,2,11,22,33,44,11,11,55,55,66,2,3};
        int c[]={0,0,2,3,4,5,6,6};


        System.out.println("\n");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == i) {
                System.out.println("迴圈a 索引: " + i + " 相同值: " + a[i]);


            }
        }
        System.out.println("\n");
        for (int i = 0; i < b.length; i++){
            if (b[i]==i)
            {
                System.out.println("迴圈b 索引:" + i + " 相同值: " + b[i]);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < c.length; i++){
            if (c[i]==i)
            {
                System.out.println("迴圈c 索引:" + i + " 相同值: " + c[i]);
            }
        }



    }


}

package org.example;
import  java.util.*;
class BMIf
{
    private double height;
    private double weight;


    void bmifunction(double height,double weight)
    {


        double Height=height/100; //把身高數值/100 轉換公尺
        double sqrheight=Math.pow(Height ,2); //身高平方 藉數學套件 Math.pow(身高,2次方)
        double BMI=weight/sqrheight; //BMI 公式
        double bmi = Math.round(BMI*100)*0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
        System.out.println("BMI :"+bmi); //印出BMI值

    }

}

public class BMIv0
{
    public static void main(String[]args)
    {
        System.out.println("Input Height weight :");
        Scanner scanner=new Scanner(System.in);

        BMIf bmi0=new BMIf();

//        int i;
        double array[]=new double[100];
        double inputHeightWeight=scanner.nextDouble();
        boolean input=false;
        while(!input)
        {
            if(inputHeightWeight==-999)
            {
            input=true;
            }
            else
            {

                for(int i=0;i<array.length;i++)
                {

                    array[i]=inputHeightWeight;

                }
                input=false;


            }

        }
//       System.out.println(array[1]);




//        bmi0.bmifunction(1,2);







    }

}

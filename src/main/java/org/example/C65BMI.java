package org.example;
import java.util.Scanner;
//import java.util.*;
class BmiUtil
{   private double height;
    private double weight;
    void setHeightsetWeight()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        System.out.print("Weight: ");
        double weight = scanner.nextDouble();
        this.height = height;
        this.weight=weight;
    }
    void getBmi()
    {
        if(height>=2.5&&height<=250) {
            double Height = height / 100; //把身高數值/100 轉換公尺
            double sqrheight = Math.pow(Height, 2); //身高平方 藉數學套件 Math.pow(身高,2次方)
            double BMI = weight / sqrheight; //BMI 公式
            double bmi = Math.round(BMI * 100) * 0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :" + bmi); //印出BMI值
        }
        else
        {
            double sqrheight = Math.pow(height, 2); //身高平方 藉數學套件 Math.pow(身高,2次方)
            double BMI = weight / sqrheight; //BMI 公式
            double bmi =Math.round(BMI*100)*0.01 ; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :" + bmi); //印出BMI值
        }
    }
}

public class C65BMI {
    public static void main(String[] args) {
        System.out.println("Bmi System :");
        BmiUtil bmi = new BmiUtil();
        try{
            bmi.setHeightsetWeight();
            bmi.getBmi();
        }
        catch (Exception e)
        {
            System.out.println("Error input");
        }
    }
}

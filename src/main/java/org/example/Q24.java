package org.example;
import java.util.*;
class Student
{
    private String name;
    private int age;
    private double height;
    private double weight;

    void nameNage()
    {
        name="joe";
        age=15;
        System.out.println("\nName :"+name+"\n"+"age :"+age+"\n");

    }
    void nameNageNheightNweight()
    {
        name="carol";
        age=16;
        height=166.5;
        weight=50.5;
        System.out.println("Name :"+name+"\n"+"age :"+age+"\n"+"height :"+height+"\n"+"weight :"+weight);


    }
    void BMI(double height ,double weight)
    {
        if(height>2.5)
        {
            double Height=height/100;
            double sqrheight=Math.pow(Height ,2);
            double BMI=weight/sqrheight;
            double bmi=Math.round(BMI);
            System.out.println("BMI :"+bmi);
        }
        else {
            double Height = height / 100;
            double sqrheight = Math.pow(Height, 2);
            double BMI = weight / sqrheight;
            double bmi = Math.round(BMI);
            double Bmi=Math.floor(bmi/10000);
            System.out.println("BMI :"+Bmi);

        }
    }

}
class BMI extends Student
{
    void printOutStudent1()
    {
        String name="carol";
        int age=16;
        double height=166.5;
        double weight=66.6;
        double bmi=24.0;
        System.out.println("\nName :"+name+"\n"+"age :"+age+"\n"+"bmi :"+bmi+"\n");



    }
    void BMI(double height ,double weight )
    {

        if(height<250 && height>=2.5 && weight<300 && weight>1)
        {
            double Height=height/100;
            double sqrheight=Math.pow(Height ,2);
            double BMI=weight/sqrheight;
            double bmi=Math.round(BMI);
            System.out.println("BMI :"+bmi);
        }
        else if (height>=1 && height<=2.5&& weight<300 && weight>1) {
            double Height = height / 100;
            double sqrheight = Math.pow(Height, 2);
            double BMI = weight / sqrheight;
            double bmi = Math.round(BMI);
            double Bmi=Math.floor(bmi/10000);
            System.out.println("BMI :"+Bmi);

        }

    }






}
public class Q24
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        Student std=new Student();
        std.nameNage();
        std.nameNageNheightNweight();

        System.out.println("\nInput Weight (kilograms):");
        double inputWeight=scanner.nextDouble();
        System.out.println("Input Height (meters):");
        double inputHeight=scanner.nextDouble();
        std.BMI(inputHeight,inputWeight);

        BMI std1=new BMI();
        std1.printOutStudent1();

        System.out.println("Input student2's info :");
        System.out.println("Please input student2's Name :");
        double std2InputName=scanner.nextDouble();
        System.out.println("Please input student2's age  :");
        int std2InputAge=scanner.nextInt();
        System.out.println("Please input student2's height :");
        double std2InputHeight=scanner.nextDouble();
        System.out.println("Please input student2's weight :");
        double std2InputWeight=scanner.nextDouble();











    }


}

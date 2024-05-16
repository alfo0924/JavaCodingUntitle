package org.example;
import java.util.*;
class Student //類別:學生
{
    private String name; //隱藏 字串 名字
    private int age;     //隱藏 數值 年紀
    private double height;//隱藏 浮點 身高
    private double weight;//隱藏 浮點 體重

    void nameNage() //方法:印出名子和年紀
    {
        name="joe"; //由於在類別裡面所以不用特別宣告 字串 name
        age=15;
        System.out.println("\nName :"+name+"\n"+"age :"+age+"\n");

    }
    void nameNageNheightNweight() //方法:印出名字年紀身高體重
    {
        name="carol";
        age=16;
        height=166.5;
        weight=50.5;
        System.out.println("Name :"+name+"\n"+"age :"+age+"\n"+"height :"+height+"\n"+"weight :"+weight);


    }
    void BMI(double height ,double weight)  //方法:取BMI
    {
        if(height>2.5) //建立判斷式 若身高數值大於2.5 (若使用者輸入是公分不是公尺)
        {
            double Height=height/100; //把身高數值/100 轉換公尺
            double sqrheight=Math.pow(Height ,2); //身高平方 藉數學套件 Math.pow(身高,2次方)
            double BMI=weight/sqrheight; //BMI 公式
            double bmi = Math.round(BMI*100)*0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :"+bmi); //印出BMI值
        }
        else {
//            double Height = height / 100;
            double sqrheight = Math.pow(height, 2); //身高平方 藉數學套件 Math.pow(身高,2次方)
            double BMI = weight / sqrheight;  //BMI 公式
            double bmi = Math.round(BMI*100)*0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :"+bmi); //印出BMI值

        }
    }

}
class BMI extends Student //類別 BMI 繼承 學生類別
{
    void printOutStudent1() //方法:印出1號學生
    {
        String name="carol";
        int age=16;
        double height=166.5;
        double weight=66.6;
        double bmi=24.0;
        System.out.println("Name :"+name+"\n"+"age :"+age+"\n"+"bmi :"+bmi+"\n");



    }
    void BMI(double height ,double weight ) //方法:BMI (判斷式:身高範圍&&體重範圍)
    {

        if(height<250 && height>=2.5 && weight<300 && weight>1) //判斷式(範圍)(若使用者輸入身高單位是公分而不是公尺)
        {
            double Height=height/100;
            double sqrheight=Math.pow(Height ,2);
            double BMI=weight/sqrheight;
            double bmi = Math.round(BMI*100)*0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :"+bmi);
        }
        else if (height>=1 && height<=2.5&& weight<300 && weight>1)
        {

            double sqrheight = Math.pow(height, 2);
            double BMI = weight / sqrheight;
            double bmi = Math.round(BMI*100)*0.01; //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位
            System.out.println("BMI :"+bmi);

        }


    }
    void printOutInfo(String name,int age,double height ,double weight) //方法:印出 名子 年齡 BMI
    {



        if(height<250 && height>=2.5 && weight<300 && weight>1) //判斷式
        {
            double Height=height/100;
            double sqrheight=Math.pow(Height ,2);
            double BMI=weight/sqrheight;
            double bmi = Math.round(BMI*100)*0.01;


//            System.out.println("BMI :"+bmi);

            System.out.println("Name :"+name); //印出名子
            System.out.println("age :"+age);   //印出年齡
            System.out.println("bmi :"+bmi);   //印出bmi
        }
        else if (height>=1 && height<=2.5&& weight<300 && weight>1) {
//            double Height = height / 100;
            double sqrheight = Math.pow(height, 2); //身高平方 藉數學套件 Math.pow(身高,2次方)
            double BMI = weight / sqrheight;        //BMI公式
            double bmi = Math.round(BMI*100)*0.01;  //把BMI的值 *100後四捨五入在*0.01 為了取小數點後兩位


            System.out.println("Name :"+name);
            System.out.println("age :"+age);
            System.out.println("bmi :"+bmi);

        }




    }






}
public class Q24
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in); //建立scanner 套件
        Student std=new Student();              //建立 std 物件 對應 類別student
        std.nameNage();                         //用std呼叫 方法:印出名子和年紀
        std.nameNageNheightNweight();           //用std呼叫 方法:印出名字年紀身高體重

        System.out.println("\nInput Weight (kilograms):");  //請示輸入體重
        double inputWeight=scanner.nextDouble();            //建立輸入 體重的scanner
        System.out.println("Input Height (meters):");       //請示輸入身高
        double inputHeight=scanner.nextDouble();            //建立輸入 身高的scanner
        std.BMI(inputHeight,inputWeight);                   //呼叫 方法:取BMi (身高值,體重值)

        BMI std1=new BMI();                                 //建立std1 物件 應對 BMI類別
        System.out.println("\nStudent1's Info :");
        std1.printOutStudent1();                            //印出1號學生


        System.out.println("\nInput student2's info :");  //請示輸入 2號 學生資訊
        scanner.nextLine();                                 //清除scanner bug (清理buffer記憶體)
        System.out.println("Please input student2's Name :");
        String std2InputName=scanner.nextLine();
        System.out.println("Please input student2's age  :");
        int std2InputAge=scanner.nextInt();
        System.out.println("Please input student2's height :");
        double std2InputHeight=scanner.nextDouble();
        System.out.println("Please input student2's weight :");
        double std2InputWeight=scanner.nextDouble();
        BMI std2=new BMI();                             //建立std2 對應 BMI類別
        System.out.println("Student2's Info :");
        std2.printOutInfo(std2InputName,std2InputAge,std2InputHeight,std2InputWeight); // 把scanner放入到 std2並呼叫 方法:印出 名子 年齡 BMI


        System.out.println("\nInput student3's info :");
        scanner.nextLine();                                 //清除scanner bug (清理buffer記憶體)
        System.out.println("Please input student3's Name :");
        String std3InputName=scanner.nextLine();
        System.out.println("Please input student3's age  :");
        int std3InputAge=scanner.nextInt();
        System.out.println("Please input student3's height :");
        double std3InputHeight=scanner.nextDouble();
        System.out.println("Please input student3's weight :");
        double std3InputWeight=scanner.nextDouble();
        BMI std3=new BMI();                            //建立std3 對應 BMI類別
        System.out.println("Student3's Info :");
        std3.printOutInfo(std3InputName,std3InputAge,std3InputHeight,std3InputWeight); // 把scanner放入到 std3並呼叫 方法:印出 名子 年齡 BMI



    }


}

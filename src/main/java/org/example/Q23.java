package org.example;
import java.util.*; //util套件

class getDegree{ //方法:判斷式判斷成績
    public String getDegree(int grade){ //方法
        String degree = ""; //由於式String 方法所以需要一個字串作返回String值
        if(grade>=90 && grade <=100) //建立判斷式 若成績藉於多少~多少 就換得到相對應成績  &&=或
        {
            System.out.println("A");
        }
        else if (grade <=89 && grade>=80)
        {
            System.out.println("B");
        }
        else if (grade <=79 && grade>=70)
        {
            System.out.println("C");
        }
        else if (grade <=69 && grade>=60)
        {
            System.out.println("D");
        }
        else if (grade<=59 && grade>=50)
        {
            System.out.println("E");
        }

        else if (grade<=49 && grade>=0)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("\"Invalid\"");
        }
        return  degree; //將結果送回去
    }
}
class degree //建立方法:取平均(平均5個分數並取四捨五入)
{
    void getDegree(int grade1 , int grade2 , int grade3 , int grade4, int grade5)
    {
        double average=((grade1+grade2+grade3+grade4+grade5)/5);//五個分數相加在/5
        int avg=(int)Math.round(average);// 平均在透過Math.round()取四捨五入
        System.out.println("Average score :"+avg);//印出 平均(四捨五入)值
    }

}

public class Q23
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in); //建立scanner

        boolean input=false; //設定Boolean值 預設值為false
        while(!input) //建立循環條件 若等於true 就會離開循環
        {
            getDegree inputGrade=new getDegree(); //建立物件inputGrade 對應  方法:判斷式判斷成績
            System.out.println("Please input grade :");
            int inputGrade1=scanner.nextInt(); //建立inputGrade1的scanner 藉輸入scanner.nextInt()取數值

            if(inputGrade1>=0&&inputGrade1<=100) //建立判斷式 若(介於範圍~範圍)
            {
                inputGrade.getDegree(inputGrade1); //用inputGrade呼叫 方法:判斷式判斷成績內 的 方法
                input=true; //執行完後 Boolean值設定為true 以離開循環
            }
            else
            {
                System.out.println("\n\"Invalid input\"\n"); //輸入錯誤
                input=false; //條件沒有滿足 Boolean值 設定為 false 以繼續循環
            }
        }


        System.out.println("Input five course's score :"); //輸入5個成績
        degree dgree = new degree(); //建立物件dgree 對應 方法:去平均
        int degree[]=new int[5]; //建立陣列degree 藉輸入 裝5個分數 進 degree陣列
        for(int i = 0; i<5; i++) { //藉5次循環
            int inputGrade2 = scanner.nextInt(); // 建立輸入數值的scanner inputGrade2
            degree[i]=inputGrade2; //藉五次循環(i++) 把inputGrade2 輸入的數值 裝進 degree陣列 裡

        }
        int grade1=degree[0]; //提取陣列裡面的數值 並宣告變數 grade1,grade2,grade3,grade4,grade5
        int grade2=degree[1];
        int grade3=degree[2];
        int grade4=degree[3];
        int grade5=degree[4];
        dgree.getDegree(grade1,grade2,grade3,grade4,grade5); //在藉 物件dgree 呼叫getDegree(把宣告變數全部依序放進來)


//        for(int i =0;i<degree.length;i++)
//        {
//            dgree.getDegree(degree[i]);
//
//        }



    }


}

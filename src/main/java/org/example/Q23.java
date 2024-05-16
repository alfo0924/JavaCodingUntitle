package org.example;
import java.util.*;

class getDegree{
    public String getDegree(int grade){
        String degree = "";
        if(grade>=90 && grade <=100)
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

        return  degree;

    }
}
class degree
{


    void getDegree(int grade1 , int grade2 , int grade3 , int grade4, int grade5)
    {
        double average=((grade1+grade2+grade3+grade4+grade5)/5);
        int avg=(int)Math.round(average);
        System.out.println("Average score :"+avg);



    }


}


public class Q23
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);

        boolean input=false;
        while(!input)
        {
            getDegree inputGrade=new getDegree();
            System.out.println("Please input grade :");
            int inputGrade1=scanner.nextInt();

            if(inputGrade1>=0&&inputGrade1<=100)
            {
                inputGrade.getDegree(inputGrade1);
                input=true;
            }
            else
            {
                System.out.println("\n\"Invalid input\"\n");
                input=false;
            }
        }


        System.out.println("Input five course's score :");
        degree dgree = new degree();
        int degree[]=new int[5];
        for(int i = 0; i<5; i++) {
            int inputGrade2 = scanner.nextInt();
            degree[i]=inputGrade2;

        }
        int grade1=degree[0];
        int grade2=degree[1];
        int grade3=degree[2];
        int grade4=degree[3];
        int grade5=degree[4];
        dgree.getDegree(grade1,grade2,grade3,grade4,grade5);



//        for(int i =0;i<degree.length;i++)
//        {
//            dgree.getDegree(degree[i]);
//
//        }






    }


}

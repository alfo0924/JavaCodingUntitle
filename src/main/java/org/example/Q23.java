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

    }


}

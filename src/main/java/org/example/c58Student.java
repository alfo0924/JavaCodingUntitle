package org.example;

class studentVal
{

     int age;
     int id;



}


public class c58Student
{

    public static void main(String[]args)
    {
    int num1=10;
    int num2=num1;

    System.out.println(num1 == num2);


        studentVal stdv= new studentVal();

    int[]scores=new int[5];

    studentVal [] stdary = new studentVal[10];
    for(int i=0 ; i<stdary.length;i++)
    {
        studentVal stdv1= new studentVal();
        stdv1.age=18;
        stdv1.id=i+1;
        stdary[i]=stdv1;

    }
    for (studentVal stdd2 : stdary)
    {
        System.out.println( stdd2.id + ";"+stdd2.age );


    }







    }
}

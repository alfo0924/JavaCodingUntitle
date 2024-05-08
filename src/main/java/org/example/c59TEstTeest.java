package org.example;

class tesssto
{


    void addt(int num)
    {
        System.out.println("addNum"+num);
        num++;
        System.out.println("addNun"+num);

    }
    void addtage(studentVal tage)
    {
        System.out.println("addTage:"+tage.age);
        tage.age ++;
        System.out.println("addTage:"+tage.age);

    }

}


public class c59TEstTeest
{

    public static void main(String []args)
    {

        int num=10;
        System.out.println("main"+num);
//         add new refrence
        tesssto teto = new tesssto();

        teto.addt(num);
        System.out.println("main:"+num);


        studentVal dtage = new studentVal();

        dtage.age=20;
        System.out.println("Main:"+dtage.age);


        teto.addtage(dtage);
        System.out.println("Dtage :"+dtage.age);







    }







}

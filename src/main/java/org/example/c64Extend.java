package org.example;

import java.util.*;

class cbba
{

    String status;

}

//藉extends 繼承父層
class abpa extends  cbba
{
int id=50;
abpa()
{
    super.status="statssss11354";


}




}
//藉extends 繼承父層
class baba extends abpa
{

    baba()
    {

        super.id=555686;


    }




 void printOut()
 {
     System.out.println("id : "+id);
     System.out.println("status : "+status);
     System.out.println();


 }


}
class dta extends abpa
{
    dta()
    {
        super.id=6686;
        super.status="cremo338String338";
    }
    void printOut()
    {
        System.out.println("id : "+id);
        System.out.println("status : "+status);
    }

}

public class c64Extend
{
    public static void main(String[]args)
    {
        cbba ca=new cbba();
        baba b=new baba();

        dta d1= new dta();



        b.printOut();
        System.out.println(" \nblank test");


        //呼叫子層的方法
        b.printOut();
        System.out.println(" \nblank test");

        //帶入值並呼叫方法
        //由於只能初始化自己不能初始化父層
        b.id=2;
        b.status="gud";
        b.printOut();
//        System.out.println();


        d1.printOut();



    }



}

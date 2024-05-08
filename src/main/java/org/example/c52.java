package org.example;

class c122
{
    int a;
    int b;

    void ad(int tto)
    {
        b+=tto;  //b+tto ,b=500;tto(5000);
        a-=tto;

        System.out.println("  8-14 8-15 , Test : "+ tto);
        System.out.println(b);
        System.out.println(a);


    }
    void show()
    {
        System.out.println(b);
        System.out.println(a);

    }

}

public class c52
{
    public static void main(String[]args)
    {

        c122 cc1=new c122();


        cc1.a=300;
        cc1.b=500;
        cc1.ad(5000);  //tto's value is 5000 and the function is b+tto
        cc1.show();















    }
















}

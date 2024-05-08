package org.example;

class c353
{


//    int a=300;
    int a;


    void ad1( int tto2)
    {
        a+=tto2;
        System.out.println("a's value : "+a);
        System.out.println("tto2's value :"+tto2);
    }
    void show2()
    {

        System.out.println("total :"+a);


    }
    boolean ad2(int tt2)
    {
        if(tt2>0 && (tt2+a)<=10000)
        {
            System.out.println("Top up succeed : " +(tt2+a) );
            System.out.println(a);

        }

            System.out.println("Failed to top up");
            return false;



    }


}



public class c53
{
    public static void main(String[]args)
    {
        c353 c333=new c353();

//        c333.ad1(5555);

        c333.ad2(60000);
        c333.ad2(8000);
        c333.ad2(1000);
        c333.ad2(5000);




    }











}

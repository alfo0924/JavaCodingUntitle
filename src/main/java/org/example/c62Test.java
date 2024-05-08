package org.example;
import java.util.*;

class polytest
{
    int dd55;
    static int vv2()
    {
        double cc2=Math.random();
        double cc3=cc2*100;
        double cc4=Math.floor(cc3);

        int cc5=(int)cc4;
        return cc5;

    }

    void printOut2()
    {
        dd55=vv2();
        System.out.println(dd55);




    }


}

class Innertest
{
    int dd2;
    // double

    static int rand()
    {

        double cc=Math.random();
        double dd=cc*100;
        double dd01=Math.ceil(dd);
        int dd2= (int) dd01;
        // int dd3=Math.ceil(dd2);

        return dd2;

    }
    void printOut()
    {

        dd2=rand();
        System.out.println(dd2);

    }






}

public class c62Test{

    public static void main(String[] args) {



        Innertest it=new Innertest();
        polytest pt=new polytest();


        it.printOut();
        pt.printOut2();





    }

}

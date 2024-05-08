package org.example;


class bca
{
    int id=3369;
    double val=0.98;

    int add;

    String stat="gud";


    void addc33(int tto)
    {
         add +=tto;
        System.out.println(" 8-14 , tto :"+tto);

    }


    void callmp()
    {

    System.out.println("Standard id :\t"+id);
    System.out.println("Standard value :\t"+val);
    System.out.println("Standard status :\t"+stat);

    System.out.println("print out callc33 :"+  add);

    }




}

public class c51
{
    public static void main (String[]args)
    {

        System.out.println("8-7,8-11  create class object");

        bca tva=new bca();
        bca std=new bca();

        bca vc3=new bca();

        tva.id=55689;
        tva.val=0.55;
        tva.stat="Normal";





        System.out.println(tva.id);
        System.out.println(tva.stat);
        System.out.println(tva.val);




        System.out.println("\n\tStandard\t"+std.id+std.val+std.stat+"\n");

        System.out.println("8-9 , Call <Method returm ");

        System.out.println("Test print from method ");

        tva.callmp();


        System.out.println(" 8-14 8-15 , Print out vc3 :");
        vc3.add=40000000;
        vc3.addc33(44044404);
        vc3.callmp();







    }











}

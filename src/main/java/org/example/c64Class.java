package org.example;


class c64p
{

    void printOut()
    {

        System.out.println("Hello from java");
    }

}

class c64c extends c64p
{
//    c64c()
//    {
//
//
//    }

    //override
    void printOut2()
    {
        System.out.println("Hello from java 2");
    }



}
public class c64Class
{

    public  static void main(String[]args)
    {

    c64p cp = new c64p();
    c64c cc = new c64c();

    cp.printOut();
    cc.printOut2();


    }


}

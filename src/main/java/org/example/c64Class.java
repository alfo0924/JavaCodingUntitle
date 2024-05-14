package org.example;

//類別練習
class c64p
{
    void printOut()
    {
        System.out.println("Hello from java");
    }
}
class c64c extends c64p
{
    void printOut2()
    {
        System.out.println("Hello from java 2");
    }

    //override 改寫父類
    @Override
    void printOut() {

//        super.printOut();
        System.out.println("Hello from java3");
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
    cc.printOut();  //印出override


    }


}

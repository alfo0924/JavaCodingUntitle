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
    void printOut()
    {

//        super.printOut();
        System.out.println("Hello from java3");
    }

    void act()
    {
        System.out.println("Act1");
    }


}


public class c64Class
{

    public  static void main(String[]args)
    {

    c64p cp = new c64p(); //父
    c64c cc = new c64c(); //子



    cp.printOut();
    cc.printOut2();
    cc.printOut();  //印出override
    cc.act();

    System.out.println("\nTEst1"); //測試 區分用

        c64p cp2=new c64c(); //向上轉型

    cp2.printOut(); //呼叫方法
    cc.act(); // 印出act值


        System.out.println("\nTEst2");

//    強制轉child型別  向下轉型(手動)
    c64c cp1 =(c64c)cp2;

        cp1.printOut();
        cp1.printOut2();
        cp1.act();


//        c64c cp12 =(c64c)cp;
//
//        cp12.printOut();
//        cp12.printOut2();
//        cp12.act();


        System.out.println("\nTEst3");

    c64c cp11=(c64c)cp2;
        cp11.printOut();
        cp11.printOut2();
        cp11.act();


    }


}

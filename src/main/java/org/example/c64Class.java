package org.example;

//類別練習
class c64p
{
    void printOut()
    {
        System.out.println("Hello from java");
    }
    void act1()
    {
        System.out.println("Act1");
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

    void act2()
    {
        System.out.println("Act2");
    }


}
class c64a
{
void act3()
    {
        System.out.println("Act3");
    }

}
class c65a
{
    void act4()
    {
        System.out.println("Act4");
    }
    void act44()
    {
        System.out.println("Act44");
    }

}



public class c64Class
{

    public  static void main(String[]args)
    {

    c64p cp = new c64p(); //父
    c64c cc = new c64c(); //子

    System.out.println(" Default value : ");

    cp.printOut();
    cp.act1();
    cc.printOut2();
    cc.printOut();  //印出override
    cc.act1();
    cc.act2();

    System.out.println("\nTEst1 向上轉型 "); //測試 區分用

        c64p cp2=new c64c(); //向上轉型

    cp2.printOut(); //呼叫方法
    cp2.act1(); // 印出act值


//        cp2.act2(); //無法印出子類別


        System.out.println("\nTEst2 向下轉型");

//    強制轉child型別  向下轉型(手動)
    c64c cp1 =(c64c)cp2;

        cp1.printOut();
        cp1.printOut2();
        cp1.act1();
        cp1.act2();


//        c64c cp12 =(c64c)cp;
//        cp12.printOut();
//        cp12.printOut2();
//        cp12.act1();
//        cp12.act2();

        System.out.println("\nTEst3 向下轉型");

    c64c cp11=(c64c)cp2;
        cp11.printOut();
        cp11.printOut2();
        cp11.act1();
        cp11.act2();

        System.out.println("\nTEst 測試多型 ");
        c64a ca=new c64a();
        c65a c5a=new c65a();

        ca.act3();
        c5a.act4();
        c5a.act4();





    }


}

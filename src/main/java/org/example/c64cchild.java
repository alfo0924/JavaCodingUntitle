package org.example;

class parent
{

//    final void show() //如果方法加final 方法就無法被沿用
//    {
//        System.out.println("ShowTIme final method  !!");
//    }
//

    void show()
    {
        System.out.println("Show TIme !! ");
    }
}


//final class parent  // 如果class 前面加final 就無法被繼承
//{
//
//
//
//}

class child extends parent
{@Override
void show()
{
System.out.println("Hellowrold override !");
}

}
public class c64cchild
{
    public static void main(String[]args)
    {
        parent p =new parent();
        p.show();

        child c=new child();
        c.show();

        parent p1=new parent();
        p1.show();


    }


}

package org.example;
import java.util.*;
class ic
{

    int id=1012255;
    int money=5000;


    void showIc()
    {




    System.out.println();
    System.out.println(id);
    System.out.println(money);




    }
    void funICId(int type)
    {


          id=type;
//         type=id;
//         type=this.id;
//        return id;

    }




}





public class icCard
{

    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numb to set id:");
        int type=scanner.nextInt();


        ic ic1=new ic();
        ic ic2=new ic();

        ic1.funICId(type);
        ic1.showIc();

        ic2.showIc();



    }







}

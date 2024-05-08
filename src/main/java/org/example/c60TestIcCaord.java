package org.example;
class AreoMachine
{

    int amount;
    int getAmount(IcCard223[]icc)
    {
        int amount=0;

        return amount;

    }
    void addSystem()
    {



    }







}

class IcCard223
{

int id;
int money;
void showInfo()
{

    System.out.println(money);

}
     void add(int money)
     {
         this.money+=money;
         System.out.println("Add money :"+ money +"\namount :"+ this.money);

     }

     void addAmount(int amount)
     {
         amount+=amount;


     }
     int getAmount(IcCard223[]cards)
     {
         int amount=0;
         for(int i=0;i<cards.length;i++)
         {
             amount+=cards[i].money;
         }
         for(IcCard223 card: cards)
         {
             amount+=card.money;

         }
         return amount;

     }



}


public class c60TestIcCaord
{

    public static void main(String[]args)
    {
        IcCard223 card1 = new IcCard223();
        card1.money = 500;
        card1.add(500);
        card1.showInfo();


        int i ;
        int amount = 0;
        for (i=0; i <= 10; i++)
        {
            amount +=1;

        }
        System.out.println(i);
        System.out.println(amount);

        IcCard223 icc1=new IcCard223();
        icc1.money=100;
        IcCard223 icc2=new IcCard223();
        icc2.money=200;
        IcCard223 icc3=new IcCard223();
        icc3.money=300;
        IcCard223 icc4=new IcCard223();
        icc4.money=400;
        IcCard223 icc5=new IcCard223();
        icc5.money=500;


        IcCard223 icc[]=new IcCard223[5];
        icc[0]=icc1;
        icc[1]=icc2;
        icc[2]=icc3;
        icc[3]=icc4;
        icc[4]=icc5;

        AreoMachine am=new AreoMachine();






    }






}

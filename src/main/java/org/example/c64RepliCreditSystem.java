package org.example;

class creditS
{

    int money=50000;
    int amount;

    void addCredit(int m)
    {
        this.money+=m;


    }
    void minusCredit(int m)
    {
        this.money-=m;

    }
    void printoutAmount()
    {
        System.out.println("Amount : "+money);
    }
    void updateMoney(int m)
    {

        this.money=m;
        System.out.println("Update money : "+this.money);
    }


}
class deposit extends creditS
{
void deposit(int m)
{
    int k=m+money;
    System.out.println("Deposit amount : "+m);

    super.updateMoney(k);
}

}
class withdrawal extends creditS
{
 void withdrawl(int m)
 {
  int k=money-m;
  System.out.println("Withdrawal amount :"+m);
  super.updateMoney(k);

 }

}
public class c64RepliCreditSystem
{
    public static void main(String[]atgs)
    {
        System.out.println("\nDefault : ");
        creditS cs=new creditS();
        cs.addCredit(55);
        cs.minusCredit(10);
        cs.printoutAmount();

        System.out.println("\nUpdate Deposit :");

        deposit d=new deposit();
        d.money= cs.money;
        d.deposit(80000);

        System.out.println("\nUpdate withdrawal :");
        withdrawal wd=new withdrawal();
        wd.money=d.money;
        wd.withdrawl(6000);

        System.out.println("\nUpdate Deposit2 :");
        deposit d1=new deposit();
        d1.money=wd.money;
        d1.deposit(50000);

        System.out.println("\nUpdate withdrawal2 :");
        withdrawal wd1=new withdrawal();
        wd1.money=d1.money;
        wd1.withdrawl(8000);

        System.out.println("\nUpdate Deposit3 :");
        deposit d2=new deposit();
        d2.money=wd1.money;
        d2.deposit(33955);

        System.out.println("\nUpdate withdrawal3 :");
        withdrawal wd2=new withdrawal();
        wd2.money=d2.money;
        wd2.withdrawl(10000);

        System.out.println("\nUpdate Deposit4");
        deposit d3=new deposit();
        d3.money=wd2.money;
        d3.deposit(110000);











    }




}

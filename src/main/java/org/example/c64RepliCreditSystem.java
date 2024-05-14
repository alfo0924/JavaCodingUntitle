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











    }




}

package org.example;

class credS
{
    int money;
    void addMoneyF(int m)
    {
        this.money+=m;
        System.out.println("\nInitial add amount :"+"+"+m);
        System.out.println("Totoal cred amount :"+this.money);
    }
    void minusMoneyF(int m)
    {
        this.money-=m;
        System.out.println("Initial minus amount :"+"-"+m);
        System.out.println("Totoal cred amount :"+this.money);
    }
    void UpdateAmount(int m)
    {
        this.money=m;
        System.out.println("Update amount :"+money);
    }

}
class depositS extends credS
{
    void depositS(int m)
    {
        //k equals money add m (m as variable)
        int k=this.money+m;
        System.out.println("Deposit add amount :"+"+"+m);
        //send the value of k back to UpdateAmount (function)
        super.UpdateAmount(k);
    }
}
class withdrawalS extends credS
{
    void withdrwawalS(int m)
    {
        int k=this.money-m;
        System.out.println("Withdrawal minus amount :"+"-"+m);
        super.UpdateAmount(k);
    }

}

public class c64credCcS
{
    public static void main(String[]args)
    {
        credS c=new credS();
        c.addMoneyF(5000);
        c.minusMoneyF(4000);

        System.out.println("\nDeposit :");
        depositS ds=new depositS();
        ds.money=c.money; // To get latest amount directly
        ds.depositS(8000);

        System.out.println("\nWithdrawal :");
        withdrawalS ws=new withdrawalS();
        ws.money=ds.money;
        ws.withdrwawalS(5000);

        System.out.println("\nDeposit2 :");
        depositS ds2=new depositS();
        ds2.money=ws.money;
        ds2.depositS(9000);

        System.out.println("\nWithdrawal2 :");
        withdrawalS ws2=new withdrawalS();
        ws2.money=ds2.money;
        ws2.withdrwawalS(6000);

        System.out.println("\nDeposit3 :");
        depositS ds3=new depositS();
        ds3.money=ws2.money;
        ds3.depositS(8000);

        System.out.println("Withdrawal3 :");
        withdrawalS ws3=new withdrawalS();
        ws3.money=ds3.money;
        ws3.withdrwawalS(8000);

        System.out.println("\nDeposit4 :");
        depositS ds4=new depositS();
        ds4.money=ws3.money;
        ds4.depositS(993100);

        System.out.println("\nWithdrawals :");
        withdrawalS ws4=new withdrawalS();
        ws4.money=ds4.money;
        ws4.withdrwawalS(100);






    }

}

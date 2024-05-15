package org.example;

class creditS
{

    int money=50000; //宣告
//    int amount; //可省略

    void addCredit(int m)
    {
        this.money+=m; //方法:加錢

    }
    void minusCredit(int m)
    {
        this.money-=m; //方法:扣錢
    }
    void printoutAmount()
    {
        System.out.println("Amount : "+money);
    } //方法:印出總額度
    void updateMoney(int m)
    {

        this.money=m;
        System.out.println("Update money : "+this.money); //方法:更新最新額度並印出
    }


}
class deposit extends creditS
{
void deposit(int m)
{
    int k=m+money; //運算式
    System.out.println("Deposit amount : "+m); //方法:存款

    super.updateMoney(k); //回傳到 父類 方法:更新額度 並改寫
}

}
class withdrawal extends creditS
{
 void withdrawl(int m)
 {
  int k=money-m; //運算式
  System.out.println("Withdrawal amount :"+m); //方法:提款
  super.updateMoney(k);//回傳到 父類 方法:更新額度 並改寫

 }

}
public class c64RepliCreditSystem
{
    public static void main(String[]atgs)
    {
        System.out.println("\nDefault : ");
        creditS cs=new creditS(); //建立物件cs
        cs.addCredit(55); //放值到 方法:加錢
        cs.minusCredit(10);//放值到 方法:扣錢
        cs.printoutAmount(); //呼叫 方法:印出額度

        System.out.println("\nUpdate Deposit :");

        deposit d=new deposit(); //建立物件d
        d.money= cs.money; //d 抓取 cs 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        d.deposit(80000); //方法:存款(存多少)  在由 方法:存款加錢

        System.out.println("\nUpdate withdrawal :");
        withdrawal wd=new withdrawal(); //建立物件wd
        wd.money=d.money; //wd 抓取 d 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        wd.withdrawl(6000);//方法:提款款(提多少)  在由 方法:提款扣錢

        System.out.println("\nUpdate Deposit2 :");
        deposit d1=new deposit();//建立物件d1
        d1.money=wd.money;//d1 抓取 wd 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        d1.deposit(50000);//方法:存款(存多少)  在由 方法:存款加錢

        System.out.println("\nUpdate withdrawal2 :");
        withdrawal wd1=new withdrawal();//建立物件wd1
        wd1.money=d1.money;//wd1 抓取 d1 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        wd1.withdrawl(8000);//方法:提款款(提多少)  在由 方法:提款扣錢

        System.out.println("\nUpdate Deposit3 :");
        deposit d2=new deposit();//建立物件d2
        d2.money=wd1.money;//d2 抓取 wd1 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        d2.deposit(33955);//方法:存款(存多少)  在由 方法:存款加錢

        System.out.println("\nUpdate withdrawal3 :");
        withdrawal wd2=new withdrawal();//建立物件wd2
        wd2.money=d2.money;//wd2 抓取 d2 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        wd2.withdrawl(10000);//方法:提款款(提多少)  在由 方法:提款扣錢

        System.out.println("\nUpdate Deposit4");
        deposit d3=new deposit();//建立物件d3
        d3.money=wd2.money;//d3 抓取 wd2 最新額度 作更新 否則會用原始額度(宣告變數) 作運算
        d3.deposit(110000);//方法:存款(存多少)  在由 方法:存款加錢

//        d3.printoutAmount();











    }




}

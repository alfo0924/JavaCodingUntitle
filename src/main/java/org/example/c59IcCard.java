package org.example;

class icc
{
int id;
int money;

void showInfo()
{

    System.out.println(id+";"+money);
}
boolean add(int value)
{
    int amount = money+value;
    if(value>=0 && amount <=1000)
    {

        money+=value;
        return true;

    }
    else
    {
        return false;

    }



}




}
public class c59IcCard
{
    public static void main(String[]args)
    {

        icc ic1[]=new icc[5];

        for(int i=0; i<ic1.length;i++)
        {
            icc ic10=new icc();
            ic10.id=i+1;
//            int i1=1
            ic10.money= ic10.id*10;
            ic1[i]=ic10;

            ic10.showInfo();
            ic10.add(200);


        }
        int sum=0;
        for(icc k:ic1)
        {

            sum+=k.money;
            System.out.println(k.money);




        }
        System.out.println("Total amount :"+sum);
        System.out.println(ic1[0].add(5000));



//        int moneySum = 0; // Variable to store the sum of money
//
//        for (icc k : ic1)
//        {
//            moneySum += k.money; // Accumulate the money values
//        }
//
//        System.out.println("Total money sum: " + moneySum); // Print the total sum







    }

}

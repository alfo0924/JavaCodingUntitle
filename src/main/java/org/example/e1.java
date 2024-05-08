package org.example;

public class e1
{
    public static void main(String[]args)
    {
        byte i=-2;
        i=(byte)(i>>5 );
        System.out.println(i);

        int sum=0;
        int sum2=0;
        int sum3=0;

        int sum4=0;
        int sum5=0;
        int sum6=0;

        for(int i2 = 0 ; i2<=10; i2++)
            {
                sum+=i2*i2;
                sum2=i2*i2;
                sum3=sum+(i2*i2);
                sum6++;

            }
            System.out.println(sum);
            System.out.println(sum2);
            System.out.println(sum3);

                sum5=sum5+1;

            System.out.println(sum4+=1);
            System.out.println(sum5);
            System.out.println(sum6);




    }


}

package org.example;
import java.util.Scanner;
import java.io.*;

public class c4
{
    public  static void main (String[]args)
    {

        Scanner c=new Scanner(System.in);
        System.out.println(" 6-14 ,14-8  Enter anything to input into textbook :");


        String ip=c.nextLine();

        try
        {
            BufferedWriter bo=new BufferedWriter(new FileWriter("zz1.txt"));
            for( int i=0; i<=99;i++)
            {
                for(int i2=0 ; i2<=99 ;i2++ )
                {
                    double times=i*i2;
                    System.out.println(i+"*"+i2+"="+times);
                    bo.write("\n"+i+"*"+i2+"=\t"+times+"\n");
                }

            }
             bo.write(ip);
//             bo.write(times);
            bo.close();


        }
        catch(IOException ioe)
        {
            System.out.println(ioe +"IOException");
        }









    }


}

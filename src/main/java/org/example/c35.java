package org.example;
import java.io.*;


public class c35
{
    public static void main(String[]args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("5-22 BufferedReader InputStreamReader \n" );
        System.out.println("Type any numbers : \n");
        String a=br.readLine();
        int num=Integer.parseInt(a);

        System.out.println("The numbers you've type :\t"+num+"\n");

        System.out.println("5-25  To upper case:\n");
        System.out.println("Type any words that you want to Converted to UpperCase :\n");
        String as=br.readLine();
        String acc=as.toUpperCase();
        System.out.println("The words that you've type has already been covert into UpperCase :\n\t"+acc);



        System.out.println("\n6-12 Test DoWhile ,Enter any number :");
        String ac=br.readLine();
        int asc=Integer.parseInt(ac);
            int i3=0;
            do
            {
                System.out.println("\tTest 6-12 DoWhile :"+i3+++"times");

            }while(asc++<100);


        System.out.println("\n6-12 Test2 While ,Enter any number :");
            String af=br.readLine();
            int afc=Integer.parseInt(af);
            while(afc<100)
                {
                    System.out.println( afc++);

                }

            System.out.println();



            int a3=5;
            int a4=5;
            do
            {
            System.out.println("\n"+a3++);

            }while(a3<10);

            System.out.println("\n");
            while(a4<10)
            {
                System.out.println(a4++);

            }



            System.out.println("\n 7-18 doubleDimentionArray test :\n");
            int a44[][]={{1,2,4},{4,5,6,7}};

            System.out.println("Array's elements :" + a44.length);
            for(int i=0 ; i<a44.length;i++)
                {
                    System.out.println("Element's quantity :"+a44[i].length);
                    for(int k=0 ; k<a44[i].length;k++)
                    {

                        System.out.println( "Print out element's data" +a44[i][k]);
                    }


                }






    }




}

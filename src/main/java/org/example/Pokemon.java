package org.example;
import java.util.*;

class pokemonnn
{
    private String name="Un-nameed pokemon";
    private String stat="Unknow";
    private double force=50.0;

    private double hp=50;

    private double cp=0.0;

    private int candy=0;


    private int level=0;



    void sendPokeInfo()
    {

        System.out.println("Pokemon's Name :"+name);
        System.out.println("Pokemon's Status :"+stat);
        System.out.println("Pokemon's Force :"+force);
        System.out.println("Pokemon's HP :"+hp);
        System.out.println("Pokemon's CP :"+cp);
        System.out.println("Pokemon;s Candy :"+candy);
        System.out.println("Pokemon's Level :"+level+"\n");


//        System.out.println(""+null );


    }
    String rename(String rename)
    {

        name=rename;
        return name;
    }
    double Sethp(double Sethp)
    {
        hp=Sethp;
        return hp;


    }
    String SetStat(String SetStat)
    {
        stat=SetStat;
        return stat;

    }

    double powerUp(double powup)
    {
        force=force+powup;

        return force;
    }
    double SetCp(double SetCp)
    {

        cp=SetCp;
        return SetCp;

    }

    int SetCandy(int SetCandy)
    {
        candy=SetCandy;
        return candy;



    }

    int SetLevel(int SetLevel)
    {
        level=SetLevel;
        return level;
    }
//    double reCalCp(int ReCalCp)
//    {
//
//        candy=ReCalCp-20;
//        cp+=5;
//
//
//        return cp;
//    }


    double reCalCp(double reCalCp)
    {
        candy-=20;
        cp+=5;
        cp++;
        return cp;
    }

    int reCountLevel ()
    {
        if(candy>=10)
        {

            candy-=20;
            cp+=10;
            this.level++;
            return this.level;
        }
        else
        {
            return this.level;
        }
    }





}




public class Pokemon
{
    public static void main(String[]args)
    {


        java.util.Scanner scanner=new java.util.Scanner(System.in);


        pokemonnn pkc =new pokemonnn();
        pokemonnn pkc2=new pokemonnn();
        pokemonnn pkc3=new pokemonnn();



        pkc.powerUp(500);
        pkc.sendPokeInfo();

        pkc2.rename("pika");
        pkc2.SetStat("Guud");
        pkc2.powerUp(556);
        pkc2.Sethp(500);
        pkc2.SetCp(20);
        pkc2.SetCandy(20);
        pkc2.SetLevel(10);

        pkc2.sendPokeInfo();



        System.out.println("Input pokemon's info :");
        System.out.println("Input pokemon's name:");
        String name=scanner.nextLine();
        System.out.println("Input pokemon's status:");
        String status=scanner.nextLine();
        System.out.println("Input pokemon's force:");
        int force=scanner.nextInt();
        System.out.println("Input pokemon's hp:");
        double hp=scanner.nextDouble();
        System.out.println("Input pokemon's cp:");
        double cp=scanner.nextDouble();
        System.out.println("Input pokemon's candy:");
        int candy=scanner.nextInt();
        System.out.println("Input pokemon's level:");
        int level=scanner.nextInt();




        pkc3.rename(name);
        pkc3.SetStat(status);
        pkc3.powerUp(force);
        pkc3.Sethp(hp);
        pkc3.SetCp(cp);
        pkc3.SetCandy(candy);
        pkc3.SetLevel(level);

        pkc3.reCalCp(candy);


        pkc3.sendPokeInfo();









    }









}

package org.example;

import java.util.Random;

class car  //類別:car
{
    private String carId;
    private int enginId;
    private String color;

    private String car;
    Random random=new Random(); //建立隨機取樣套件
    String[] COLORS = {"White", "Black", "Blue"};

    int numOfCars;

    void SetEngineID() //方法:引擎id
    {
         enginId=((int)(Math.random()*100000000));

        System.out.println("Engine id :"+enginId);





    }
    void setCarId()
    {
        String charaters=("ABCDEFGHIJKLMOPQRSTUVWXYZ");
        this.carId=carId;
        StringBuilder carid = new StringBuilder("T");
        for (int i = 0; i < 2; i++) {
            carid.append(charaters.charAt(random.nextInt(charaters.length())));
        }
        carid.append('-');
        for (int i = 0; i < 3; i++) {
            carid.append(random.nextInt(10));
        }
        carId=carid.toString();
        System.out.println("Set CarId :"+carid);


    }
    void setColor()
    {

        color=COLORS[random.nextInt(COLORS.length)]; //從 COLORS array 裡透過.random 抓取隨機值


        System.out.println("Set Color :"+color);



    }



    void getProducedCars(int cars)
    {
        numOfCars=+cars;
        System.out.println("Total Produce :"+numOfCars);

    }
    void produceCar()
    {
        int produce=((int)(Math.random()*100));
        System.out.println("Produce cars :"+produce);
        SetEngineID(); // Generate a new engine ID
        setCarId();    // Generate a new car ID
        setColor();    // Generate a new color


//
//        System.out.println("Engine Id :"+ enginId);
//        System.out.println("Car Id :"+carId);
//        System.out.println("Color :"+color);

    }
    void updateCarId(String car, String carId)
    {


    }

    void updateCarColor(String car, String carId)
    {

    }
    void printOut()
    {
        System.out.println();
    }



}
class TaxiFactory extends car //類別:計程車工廠
{



}
class EletronicCarFactory extends car //類別:電車工廠
{



}


public class C64Car
{

    public static void main(String[]args)
    {

    System.out.println("\nCarFactory :");
    car c=new car();
    c.produceCar();

    System.out.println("\nTaxi Factory :");
    TaxiFactory tf=new TaxiFactory();
    tf.produceCar();

    System.out.println("\nEletronicCarFactory :");
    EletronicCarFactory etcf=new EletronicCarFactory();
    etcf.produceCar();








    }







}

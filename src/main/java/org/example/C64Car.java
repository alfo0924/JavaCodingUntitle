package org.example;

import java.util.Random;

class car  //類別:car
{
    private String carId;
    private String enginId;
    private String color;

    private String car;
    Random random=new Random(); //建立隨機取樣套件
    String[] COLORS = {"White", "Black", "Blue"};

    int numOfCars;

    final static int engineID() //方法:引擎id
    {
        int enginId=((int)(Math.random()*100000000));

        System.out.println("\nEngine id :"+enginId);





    }
    void setCarId()
    {
        String charaters=("ABCDEFGHIJKLMOPQRSTUVWXYZ");
        this.carId=carId;
        StringBuilder carId = new StringBuilder("T");
        for (int i = 0; i < 2; i++) {
            carId.append(charaters.charAt(random.nextInt(charaters.length())));
        }
        carId.append('-');
        for (int i = 0; i < 3; i++) {
            carId.append(random.nextInt(10));
        }
        System.out.println("Set CarId :"+carId);


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
        System.out.println("Engine Id :"+enginId);
        System.out.println("Car Id :"+carId);
        System.out.println("Color :"+color);

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
class taxiFactory extends car //類別:計程車工廠
{



}
class ElectronicCarFactory extends car //類別:電車工廠
{



}


public class C64Car
{

    public static void main(String[]args)
    {

    car c=new car();
    c.engineID(); // 印出enginID
    c.setCarId();
    c.setColor();

    System.out.println("\nCarFactory :");
    c.produceCar();








    }







}

package org.example;

import java.util.*;

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
        StringBuilder carid = new StringBuilder("C");
        for (int i = 0; i < 2; i++) {
            carid.append(charaters.charAt(random.nextInt(charaters.length())));
        }
        carid.append('-');
        for (int i = 0; i < 3; i++) {
            carid.append(random.nextInt(10));
        }
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
//        SetEngineID(); // Generate a new engine ID 從方法抓取就可以抓取新的EngineID
//        setCarId();    // Generate a new car ID    從方法抓取就可以抓取新的CarID
//        setColor();    // Generate a new color     從方法抓取就可以抓取新的ColorID
    }
    void updateCarId(car car, String carId)
    {
            boolean input=false;
            while(!input){
            if (carId.matches("C[aA-zZ]{2}-[\\d]{3}")) {
                System.out.println("Correct");
                input=true;

            } else {
                System.out.println("Invalid ! Please try again !");
//                System.out.println("");
                Scanner scanner=new Scanner(System.in);
                System.out.println("Please input CarId :");
                String inputCarId=scanner.nextLine();
                carId=inputCarId;
                input=false;

            }
        }
    }
    void updateCarColor(car car, String carId)
    {



    }
    void printOut()
    {
        produceCar();  // Generate a new produce numbers 從方法抓取及可取得新的產車數量
        SetEngineID(); // Generate a new engine ID 從方法抓取就可以抓取新的EngineID
        setCarId();    // Generate a new car ID    從方法抓取就可以抓取新的CarID
        setColor();    // Generate a new color     從方法抓取就可以抓取新的ColorID
    }
}
class TaxiFactory extends car //類別:計程車工廠
{

    @Override // 覆寫父類
    void setCarId()
    {
//        super.setCarId();
        String charaters=("ABCDEFGHIJKLMOPQRSTUVWXYZ");

        StringBuilder carid = new StringBuilder("T");
        for (int i = 0; i < 2; i++) {
            carid.append(charaters.charAt(random.nextInt(charaters.length())));
        }
        carid.append('-');
        for (int i = 0; i < 3; i++) {
            carid.append(random.nextInt(10));
        }
        System.out.println("Set CarId :"+carid);
    }
    void updateTaxiId(car car, String carId)
    {
        boolean input=false;
        while(!input){
            if (carId.matches("T[aA-zZ]{2}-[\\d]{3}")) {
                System.out.println("Correct");
                input=true;

            } else {
                System.out.println("Invalid ! Please try again !");
//                System.out.println("");
                Scanner scanner=new Scanner(System.in);
                System.out.println("Please input TaxiCarId :");
                String inputCarId=scanner.nextLine();
                carId=inputCarId;
                input=false;
            }
        }
    }


}
class ElectricCarFactory extends car //類別:電車工廠
{

    @Override // 覆寫父類
    void setCarId()
    {
//        super.setCarId();
        String charaters=("ABCDEFGHIJKLMOPQRSTUVWXYZ");

        StringBuilder carid = new StringBuilder("E");
        for (int i = 0; i < 2; i++) {
            carid.append(charaters.charAt(random.nextInt(charaters.length())));
        }
        carid.append('-');
        for (int i = 0; i < 3; i++) {
            carid.append(random.nextInt(10));
        }
        System.out.println("Set CarId :"+carid);

    }
    void updateElectricCarId(car car, String carId)
    {

        boolean input=false;
        while(!input){
            if (carId.matches("E[aA-zZ]{2}-[\\d]{3}")) {
                System.out.println("Correct");
                input=true;

            } else {
                System.out.println("Invalid ! Please try again !");
//                System.out.println("");
                Scanner scanner=new Scanner(System.in);
                System.out.println("Please input CarId :");
                String inputCarId=scanner.nextLine();
                carId=inputCarId;
                input=false;


            }
        }
    }



}


public class C64Car
{

    public static void main(String[]args)
    {

    System.out.println("\nCarFactory :");
    car c=new car();
    c.printOut();

    System.out.println("\nTaxi Factory :");
    TaxiFactory tf=new TaxiFactory();
    tf.printOut();

    System.out.println("\nEletronicCarFactory :");
    ElectricCarFactory etcf=new ElectricCarFactory();
    etcf.printOut();

    Scanner scanner=new Scanner(System.in);


    System.out.println("Type in carId to update carId :");
    String inputCarId=scanner.nextLine();
    c.updateCarId(c,inputCarId);

    System.out.println("Type in TaxiId to update Taxi carId :");
    String inputTaxiId=scanner.nextLine();
    tf.updateTaxiId(tf,inputTaxiId);

    System.out.println("Type in ElId to update Electric carId :");
    String inputEcarId=scanner.nextLine();
    etcf.updateElectricCarId(etcf,inputEcarId);

    }

}
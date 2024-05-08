package org.example;

import java.util.*;

class Icportal
{
    private int id=3333333;
    private String name="un-identify";

    private double assets=0.0;

    void sendInfo()
    {

        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println(""+assets+"\n");

    }

      int addValue(int value)
      {
          id = value;

        return id;
      }

      String addName(String nameo)
      {
          name=nameo;
          return nameo;



      }


}

public class IcCard22
{
    public static void main(String[]args)
    {


        Icportal icp=new Icportal();
        Icportal icp2=new Icportal();
        Icportal icp3=new Icportal();
        Icportal icp4=new Icportal();



        icp.addValue(2222);
        icp.sendInfo();


        icp2.sendInfo();

        icp3.addValue(3577899);
        icp3.addName("Mufasa");
        icp3.sendInfo();



        icp4.addValue(998998);
        icp4.addName("Neo");
        icp4.sendInfo();






    }



}

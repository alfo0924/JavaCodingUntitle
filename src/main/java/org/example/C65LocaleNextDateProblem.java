package org.example;
import java.util.*;
class time{
private int year;
private int month;
private int day;
    public void setDate(int year,int month ,int day)
    {
       this.year=year;
        this.month=month;
        this.day=day;
    }
    void getDate(int year,int month,int day)
    {
        this.year=year;
        this.month=month;
        this.day=day;
        System.out.println("The date you type : Year/month/day :"+" "+this.year+" "+this.month+" "+this.day);
        boolean input=false;
        while(!input)
        {
         switch (month)
         {
          case(1):
          case(3):
          case(5):
          case(7):
          case(8):
          case(10):
          case(12):
              if(day<=31&&day>=1){
                if(day==31)
                {
                    System.out.println("The next day :"+" "+year+" "+(month+1)+" "+1);
                    break;

                }
                else
                {
                    System.out.println("The next day :"+" "+year+" "+month+" "+(day+1));
                    break;
                }
              }
              else
              {System.out.println("Invalid input : Wrong day input !");
                  boolean input=false;
                  while(!input)
                  {
                      System.out.println("Input date before next date :");
                      Scanner scanner=new Scanner(System.in);
                      System.out.println("Input year :");
                      int typeYear=scanner.nextInt();
                      System.out.println("Input month :");
                      int typeMonth=scanner.nextInt();
                      System.out.println("Input day :");
                      int typeDay=scanner.nextInt();
                      if(typeDay<=31&&typeDay>=1)
                      {
                          if(typeDay==31&&typeYear>=1812&&typeYear<=2012)
                          {
                              System.out.println("The next day :"+" "+typeYear +" "+ (typeMonth+1)+" "+ 1);
                              input=true;
                          }
                          else if(typeDay<=31&&typeDay>=1&&typeYear>=1812&&typeYear<=2012)
                          {
                              System.out.println("The next day :"+" "+typeYear +" "+ typeMonth +" "+ (typeDay+1));
                              input=true;
                          }
                      }
                      else {
                          System.out.println("Invalid input : Wrong day input !");
                          input = false;
                      }
                  }
                  break;
              }
          case(4):
          case(6):
          case(9):
          case(11):
              if(day<=30&&day>=1){
                  if(day==30)
                  {
                      System.out.println("The next day :"+" "+year+" "+(month+1)+" "+1);
                      break;
                  }
                  else
                  {
                      System.out.println("The next day :"+" "+year + " " + month + " " + (day + 1));
                      break;
                  }
              }
              else
              {
                  System.out.println("Invalid input : Wrong day input !");
                  boolean input=false;
                  while(!input)
                  {
                      System.out.println("Input date before next date :");
                      Scanner scanner=new Scanner(System.in);
                      System.out.println("Input year :");
                      int typeYear=scanner.nextInt();
                      System.out.println("Input month :");
                      int typeMonth=scanner.nextInt();
                      System.out.println("Input day :");
                      int typeDay=scanner.nextInt();
                      if(typeDay<=30&&typeDay>=1)
                      {
                          if(typeDay==30&&typeYear>=1812&&typeYear<=2012)
                          {
                              System.out.println("The next day :"+" "+typeYear +" "+ (typeMonth+1)+" "+ 1);
                              input=true;
                          }
                          else if(typeDay<=30&&typeDay>=1&&typeYear>=1812&&typeYear<=2012)
                          {
                              System.out.println("The next day :"+" "+typeYear +" "+ typeMonth +" "+ (typeDay+1));
                              input=true;
                          }
                      }
                      else {
                          System.out.println("Invalid input : Wrong day input !");
                          input = false;
                      }
                  }
                  break;
              }
          case(2):
              if(day<=28&&day>=1)
              {
                  if(day==28)
                  {
                      System.out.println("The next day :"+" "+year +" "+ (month+1)+" "+ 1);
                      break;
                  }
                  else {
                      System.out.println("The next day :"+" "+year +" "+ month +" "+ (day+1));
                      break;
                  }
              }
              else
              {
                  System.out.println("Invalid input : Wrong day input !");
                  boolean input=false;
                  while(!input)
                  {
                      System.out.println("Input date before next date :");
                      Scanner scanner=new Scanner(System.in);
                      System.out.println("Input year :");
                      int typeYear=scanner.nextInt();
                      System.out.println("Input month :");
                      int typeMonth=scanner.nextInt();
                      System.out.println("Input day :");
                      int typeDay=scanner.nextInt();
                      if(typeDay<=28&&typeDay>=1)
                      {
                          if(typeDay==28&&typeYear>=1812&&typeYear<=2012)
                          {
                              System.out.println("The next day :"+" "+typeYear +" "+ (typeMonth+1)+" "+ 1);
                              input=true;
                          }
                          else if(typeDay<=28&&typeDay>=1&&typeYear>=1812&&typeYear<=2012) {
                              System.out.println("The next day :"+" "+typeYear +" "+ typeMonth +" "+ (typeDay+1));
                              input=true;
                          }
                      }
                      else {
                          System.out.println("Invalid input : Wrong day input !");
                          input = false;
                      }
                  }
                  break;
              }
      }
        }
    }
}
public class C65LocaleNextDateProblem {
    public static void main(String[] args) {
    time nextday=new time();
        boolean input=false;
        while(!input)
        {   System.out.println("Input date before next date :");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input year :");
            int typeYear=scanner.nextInt();
            System.out.println("Input month :");
            int typeMonth=scanner.nextInt();
            System.out.println("Input day :");
            int typeDay=scanner.nextInt();
            if(typeYear>=1812&&typeYear<=2012&&typeMonth>=1&&typeMonth<=12&&typeDay>=1&&typeDay<=31)
            {
                nextday.setDate(typeYear,typeMonth,typeDay); //setDate
                nextday.getDate(typeYear,typeMonth,typeDay);
                input=true;
            }
            else
            {
                System.out.println("\nWrong input ! (Restrict Year range:1812~2012) Please input again !\n");
                input=false;
            }
        }
    }
}

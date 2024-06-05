package org.example;
import java.util.Scanner;
class time
{
    private int year;
    private int month;
    private int day;
    public void setDate()
    {
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
            this.year=typeYear;
            this.month=typeMonth;
            this.day=typeDay;
            if(typeYear>=1812&&typeYear<=2012&&typeMonth>=1&&typeMonth<=12&&typeDay>=1&&typeDay<=31)
            {

                input=true;
            }
            else
            {
                System.out.println("\nWrong input ! \n( Restrict Year range:1812~2012,Month range:1~12,Day range:1~31 ) \nPlease input again !\n");
                input=false;
            }
        }
    }
    void getDate()
    {
        System.out.println("The date you type : Year/month/day :"+" "+this.year+" "+this.month+" "+this.day);
            switch (month)
            {
                case(1):
                case(3):
                case(5):
                case(7):
                case(8):
                case(10):
                case(12):
                    if(day<=31&&day>=1)
                    {
                          if (month==12&&day==31)
                        {
                            System.out.println("The next day :"+" "+(year+1)+" "+1+" "+1);
                            break;
                        }
                        else if(day==31)
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
                            this.year=typeYear;
                            this.month=typeMonth;
                            this.day=typeDay;
                            if(typeYear>=1812&&typeYear<=2012&&typeMonth>=1&&typeMonth<=12&&typeDay<=31&&typeDay>=1) {
                                if (typeMonth == 1 || typeMonth == 3 || typeMonth == 5 || typeMonth == 7 || typeMonth == 8 || typeMonth == 10 || typeMonth == 12) {
                                    if(month==12&&day==31)
                                    {
                                        System.out.println("The next day :"+" "+ (year+1)+" "+1+" "+1);
                                        input = true;
                                    }
                                    else if (day == 31) {
                                        System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                        input = true;
                                    }
                                    else {
                                        System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                        input = true;
                                    }
                                }//if2
                                else if (typeMonth == 4 || typeMonth == 6 || typeMonth == 9 || typeMonth == 11) {
                                    if (day <= 30 && day >= 1) {
                                        if (day == 30) {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input = true;

                                        } else {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input = true;
                                        }
                                    }
                                }//else if1
                                else if (typeMonth ==2 )
                                {
                                    if (day <= 28 && day >= 1)
                                    {
                                        if(day==28)
                                        {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input=true;
                                        }
                                        else
                                        {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input = true;
                                        }
                                    }
                                }//elseif2
                                else{
                                    input=false;
                                }
                            }//if1
                        }//while side
                        break;
                    }
                case(4):
                case(6):
                case(9):
                case(11):
                    if(day<=30&&day>=1)
                    {
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
                            this.year=typeYear;
                            this.month=typeMonth;
                            this.day=typeDay;
                            if(typeYear>=1812&&typeYear<=2012&&typeMonth>=1&&typeMonth<=12&&typeDay<=31&&typeDay>=1) {
                                if (typeMonth == 1 || typeMonth == 3 || typeMonth == 5 || typeMonth == 7 || typeMonth == 8 || typeMonth == 10 || typeMonth == 12)
                                {
                                    if(month==12&&day==31)
                                    {
                                        System.out.println("The next day :"+" "+ (year+1)+" "+1+" "+1);
                                        input = true;
                                    }
                                    else if (day == 31) {
                                        System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                        input = true;
                                    }
                                    else {
                                        System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                        input = true;
                                    }
                                }//if2
                                else if (typeMonth == 4 || typeMonth == 6 || typeMonth == 9 || typeMonth == 11) {
                                    if (day <= 30 && day >= 1)
                                    {
                                        if (day == 30) {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input = true;

                                        } else {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input = true;
                                        }
                                    }
                                }//else if1
                                else if (typeMonth ==2 )
                                {
                                    if (day <= 28 && day >= 1)
                                    {
                                        if(day==28)
                                        {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input=true;
                                        }
                                        else
                                        {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input=true;
                                        }
                                    }
                                }//elseif2
                                else{
                                    input=false;
                                }
                            }//if1
                        }//while side
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
                            this.year=typeYear;
                            this.month=typeMonth;
                            this.day=typeDay;
                            if(typeYear>=1812&&typeYear<=2012&&typeMonth>=1&&typeMonth<=12&&typeDay<=31&&typeDay>=1) {
                                if (typeMonth == 1 || typeMonth == 3 || typeMonth == 5 || typeMonth == 7 || typeMonth == 8 || typeMonth == 10 || typeMonth == 12) {
                                    if(month==12&&day==31)
                                    {
                                        System.out.println("The next day :"+" "+ (year+1)+" "+1+" "+1);
                                        input=true;
                                    }
                                    else if (day == 31) {
                                        System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                        input = true;
                                    }
                                    else {
                                        System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                        input = true;
                                    }
                                }//if2
                                else if (typeMonth == 4 || typeMonth == 6 || typeMonth == 9 || typeMonth == 11) {
                                    if (day <= 30 && day >= 1) {
                                        if (day == 30) {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input = true;
                                        } else {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input = true;
                                        }
                                    }
                                }//else if1
                                else if (typeMonth ==2 )
                                {
                                    if (day <= 28 && day >= 1)
                                    {
                                        if(day==28)
                                        {
                                            System.out.println("The next day :" + " " + year + " " + (month + 1) + " " + 1);
                                            input=true;
                                        }
                                        else
                                        {
                                            System.out.println("The next day :" + " " + year + " " + month + " " + (day + 1));
                                            input=true;
                                        }
                                    }
                                }//elseif2
                                else{
                                input=false;
                                }
                            }//if1
                        }//while side
                      break;
                    }
            }
    }
}
public class C65LocaleNextDateProblem {
    public static void main(String[] args) {
        time nextday=new time();
        nextday.setDate(); //setDate
        nextday.getDate();
    }
}
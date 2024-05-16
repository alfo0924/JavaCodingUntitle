package org.example;
import java.util.*; //Util套件

public class Q22 {
    public static void main(String[]args)
    {

        boolean input=false; //建立Boolean 預設值:false
        while(!input) //建立循環條件 若等於true就會中斷
        {
            Scanner scanner= new Scanner(System.in); //建立Scanner 套件

            System.out.println("Please input your last name and first name: ");
            System.out.println("last name :");
            String lastname=scanner.nextLine(); //建立 輸入String lastname 的scanner
            System.out.println("first name :");
            String firstname=scanner.nextLine();//建立 輸入String firstname的scanner

            if(!lastname.equals(firstname) )//建立判斷式(若lastname字串比對相等於firstname)
            {
                //若條件相符 就會 把lastname/firstname藉.toUpperCase()轉換成大寫
                //要印出 " 需要用 \" 即可印出
                System.out.println(" \"Hello "+lastname.toUpperCase() +","+
                        firstname.toUpperCase()+"!\"" );
                input=true; //條件滿足Boolean 值設為true 離開循環
            }
            else
            {
                System.out.println("\nIncorrect! Please input your name again : \n"); //輸入錯誤時顯現告示使用者
                input=false; //條件不滿足Boolean 值設為false 繼續循環
            }
        }

    }

}

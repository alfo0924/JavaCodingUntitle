import java.util.Scanner;


class v2
{

    int num1;
    int num2;
    void showTree()
    {

//        System.out.println("     *  ");
//        System.out.println("    *** ");
//        System.out.println("   *****");
//        System.out.println("  *******  ");
//        System.out.println(" *********");
//        System.out.println("************");
//        System.out.println("    ***");
//        System.out.println("    ***");
//        System.out.println("    ***");
//        System.out.println("    ***");

        System.out.println("\n運算如下:");
        System.out.println("加法Plus:"+num1+"+"+num2+"\t"+"="+(num1+num2)+"\n");
        System.out.println("減法Minus:"+num1+"-"+num2+"\t"+"="+(num1-num2)+"\n");
        System.out.println("乘法Times:"+num1+"*"+num2+"\t"+"="+(num1*num2)+"\n");
        System.out.println("除法Divide:"+num1+"/"+num2+"\t"+"="+(num1/num2)+"\n");
        System.out.println("餘數Remainder:"+num1+"%"+num2+"\t"+"="+(num1%num2)+"\n");





    }
}

 class c56
{

    public static void main (String[]args)
    {

        java.util.Scanner scanner=new java.util.Scanner(System.in);


        System.out.println("請輸入任2數範圍不超過100作運算:");

        int num=scanner.nextInt();
        int num2=scanner.nextInt();




        v2 o1=new v2();
        o1.num1=(num);
        o1.num2=(num2);



        if(num<=100 &&num>=0  && num2<=100 &&num2>=0 )
        {
            o1.showTree();


        }
        else
        {
            System.out.println("Input Error-VariablesOutOfRange 輸入數值超出範圍");

        }



    }

}
package org.example;
 interface Math0p
{
    int add(int a, int b);
}
 interface Face
{
    void smile();
}

public class c65Lambda
{
    public static void main(String[] args) {
    Face c =new Face()
    {
        @Override
        public void smile()
        {
            System.out.println("{*.*}");
        }
    };
    c.smile();
    Face c1=()->System.out.println();




    }

}

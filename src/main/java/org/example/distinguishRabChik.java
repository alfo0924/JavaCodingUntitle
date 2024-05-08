package org.example;
import java.util.Scanner;


public class distinguishRabChik
{



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入總頭數：");
            int totalHeads = scanner.nextInt();
            System.out.println("請輸入總腳數：");
            int totalLegs = scanner.nextInt();

            // 計算雞兔數量
            int chickenCount = calculateChickenCount(totalHeads, totalLegs);
            int rabbitCount = calculateRabbitCount(totalHeads, chickenCount);

            // 輸出結果
            if(chickenCount<=0 || rabbitCount<=0)
            {
                System.out.println("該數據無解");
            }
            else
            {
                System.out.println("雞的數量為：" + chickenCount);
                System.out.println("兔的數量為：" + rabbitCount);

            }
        }

        // 計算雞的數量
        public static int calculateChickenCount(int totalHeads, int totalLegs)
        {
            return (4 * totalHeads - totalLegs) / 2;
        }

        // 計算兔子的數量
        public static int calculateRabbitCount(int totalHeads, int chickenCount) {
            return totalHeads - chickenCount;
        }




    }

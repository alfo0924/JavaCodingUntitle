package org.example;

class credit {
    int money = 50000;
    int newamount;

    void addF(int m) {
        money = money + m;
        System.out.println("加錢後總額 :" + money);
    }

    void minusF(int m) {
        money = money - m;
        System.out.println("扣錢後總額 :" + money);
    }

    void printOut() {
        System.out.println("總餘額 Credit :" + money + "\n");
        newamount = money;
    }

    void setNewAmount(int money) {
        newamount=money;
    }
}

class withdraw extends credit {
    void wd(int wm) {
        newamount = newamount - wm;
        System.out.println("提領金額 Withdraw Money : " + wm);
        System.out.println("餘額 Remains :" + newamount);
        super.setNewAmount(newamount);
    }
}

class payItem extends credit {
    void pay(int m) {
        newamount = newamount - m;
        System.out.println("\n付款金額 :" + m);
        System.out.println("餘額 : " + newamount);
        super.setNewAmount(newamount);
    }
}

public class c64CreditSystem {
    public static void main(String[] args) {
        credit c = new credit();
        c.addF(500); // 加錢
        c.minusF(50); // 扣錢
        c.printOut(); // 印出及時金額

        withdraw cw = new withdraw();
        cw.newamount = c.newamount; // 抓取c更新餘額
        cw.wd(100); // 提領(金額)

        payItem pc = new payItem();
        pc.newamount = cw.newamount; // 抓取cw更新餘額
        pc.pay(3000); // 付款

        // 最後更新credit物件c的餘額
        c.money = pc.newamount; // 確保c的money變數也同步更新
        c.printOut(); // 印出最新餘額
    }
}

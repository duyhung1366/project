/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Dell
 */
public abstract class Account {

    float balance;// so tien trong tai khoan
    int transactions;//so giao dich
    public Account(float amount){
        this.balance = amount;
        this.transactions = 0;
    }
    public void deposit(float amount){
        this.balance+= amount;
        this.transactions++;
    }
    public void withDraw(float amount){
        this.balance-= amount; 
        this.transactions++;
    }
    public void endMonth(){
        endMonthCharge();
        System.out.println("So tien con lai: "+ this.balance);
        System.out.println("so giao dich da thuc hien: "+ this.transactions);
        this.transactions = 0;
    }
    public abstract void endMonthCharge();
    public static void main(String[] args) {
        System.out.println("khởi tạo account thường");
        Fee f = new Fee(100);
        f.deposit(10);
        f.deposit(20);
        f.withDraw(50);
        f.endMonth();
        System.out.println("khởi tạo account NickleDime");
        NickleDime n = new NickleDime(100);
        n.deposit(10);
        n.deposit(20);
        n.withDraw(50);
        n.withDraw(10);
        n.endMonth();
        System.out.println("khởi tạo account Gambler");
        Gambler g = new Gambler(100);
        g.deposit(10);
        g.deposit(20);
        g.withDraw(50);
        g.withDraw(10);
        g.endMonth();
    }
}

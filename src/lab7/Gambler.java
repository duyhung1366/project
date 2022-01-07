/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Gambler extends Account{

    public Gambler(float amount) {
        super(amount);
    }

    @Override
    public void withDraw(float amount) {
        Random random = new Random();
        float r = random.nextFloat();
        System.out.println("so ngau nhien: "+ r);
        if(r > 0.51){
            super.withDraw(amount*2);
        }else{
            super.withDraw(0);
        }
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endMonthCharge() {
        this.balance-= 5;
        this.transactions++;
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

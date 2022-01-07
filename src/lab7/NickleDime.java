/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Dell
 */
public class NickleDime extends Account{
    int withDrawCount;
    public NickleDime(float amount) {
        super(amount);
        this.withDrawCount = 0;
    }

    @Override
    public void withDraw(float amount) {
        super.withDraw(amount); //To change body of generated methods, choose Tools | Templates.
        withDrawCount++;
    }

    @Override
    public void endMonthCharge() {
        this.balance-= 5+ withDrawCount*0.5;
        this.transactions++;
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

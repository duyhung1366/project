/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Dell
 */
public class Fee extends Account{
    public Fee(float amount){
        super(amount);
    }
    
    @Override
    public void endMonthCharge() {
        this.balance-= 5;
        this.transactions++;
        
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
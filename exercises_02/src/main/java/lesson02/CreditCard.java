/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Date;

/**
 *
 * @author User
 */
public class CreditCard {
    public final int VISA = 5001;
    public String accountName;
    public String cardNumber;
    public Date expDate;
    public double charges;
    
    public double getCharges() {
        return charges;
    }
    
    public void disputeCharge(String chargeId, float amount) {
        System.out.println("Charge Disputed");
    }
    
}

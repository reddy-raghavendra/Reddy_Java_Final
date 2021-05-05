/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 * Bank class to illustrate equals and hashcode
 *
 * @author Raghavendra Reddy
 */
public class Bank {

    /**
     * attributes bankName which stores bank name and interestRate which stores
     * interest rate
     */
    private String bankName;
    private double interestRate;

    /**
     * constructor which takes bank name and interest rate
     *
     * @param bankName bank name
     * @param interestRate interest rate
     */
    public Bank(String bankName, double interestRate) {
        this.bankName = bankName;
        this.interestRate = interestRate;
    }

    /**
     * get the bank name
     *
     * @return bank name
     */
    public String getBankName() {
        return bankName;
    }
    
    /***
     * get the interest rate
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }
    
    /**
     * hashcode method is overrided which returns the hash based upon the 
     * bank name and interest rate, that is the reason if the two objects of Bank
     * having the same bank name and interest rate will have the same hash code
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.bankName);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.interestRate)
                ^ (Double.doubleToLongBits(this.interestRate) >>> 32));
        return hash;
    }
    
    /**
     * equals method is overrided to tell the compiler to check only the Bank 
     * object name and interest rate if the we compare the two objects of Bank
     * class with equals method
     * @param obj object
     * @return true/false based on object comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bank other = (Bank) obj;
        if (Double.doubleToLongBits(this.interestRate) != Double.doubleToLongBits(other.interestRate)) {
            return false;
        }
        if (!Objects.equals(this.bankName, other.bankName)) {
            return false;
        }
        return true;
    }

}

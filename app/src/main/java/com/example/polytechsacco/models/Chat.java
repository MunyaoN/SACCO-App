package com.example.polytechsacco.models;

import java.math.BigDecimal;

/**
 * THIS IS OUR MODEL THAT HOLDS DATA FROM SERVER
 * THIS IS A CLASS THAT HOLDS OUR NICE DATA FROM THE SERVER
 *
 */
public class Chat {
    private final String LoanNo;
    private final String LoanType;
    private final String LoanBal;

    /**
     * WE CREATE A CONSTRUCTOR TO POPULATE THE STRINGS WE JUST DECLARED

     */
    public Chat(final String LoanNo ,final String LoanType,final String LoanBal){
        /**
         * This also plays the role role ofSetters later on After we have created the getters
         */
        this.LoanNo=LoanNo;
        this.LoanType=LoanType;
        this.LoanBal= LoanBal;
    }

    /**
     *This are our getters
     */
    public String getLoanNo() {


        return LoanNo;
    }
    public String getLoanType(){

        return LoanType;
    }
    public String getLoanBal()
    {

        return LoanBal;
    }
}

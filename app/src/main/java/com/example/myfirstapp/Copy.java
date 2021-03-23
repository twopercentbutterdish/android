package com.example.myfirstapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Copy {
    /**
     *  Field representing copy's completeness.
     */
    private boolean complete;
    /**
     *  Time stamp of copy's creation.
     */
    private final Calendar creation;
    /**
     *  Time stamp of copy's purchase.
     */
    private Calendar purchase;
    /**
     *  Amount of time copy spent as listed.
     */
    private String lifespan;
    /**
     *  Listing's price
     */
    private double price;
    /**
     * Constructor.
     */
    public Copy(double cost, boolean completeness){
        this.price = cost;
        this.complete = completeness;
        this.creation = Calendar.getInstance();
    }

    //--------------------------------------------------------------------------------------------//
    /*
     * Methods.
     */
    //--------------------------------------------------------------------------------------------//

    /**
     * DOC
     */
    public boolean isComplete(){
        return this.complete;
    }
    /**
     * DOC
     */
    public void changeComplete(){
        this.complete = !this.complete;
    }
    /**
     * DOC
     */
    public void markAsSold(){
        this.purchase = Calendar.getInstance();
        this.lifespan = createLifeSpan(this.creation, this.purchase);
    }
    /**
     * DOC
     */
    public void changePrice(double newPrice){
        this.price = newPrice;
    }
    /**
     * DOC
     */
    public double getPrice(){
        return this.price;
    }
    /**
     * DOC
     */
    public String getCreation() {
        return getDate(this.creation);
    }
    /**
     * DOC
     */
    public String getPurchase(){
        return getDate(this.purchase);
    }
    /**
     * DOC
     */
    public String getLifeSpan(){
        return this.lifespan;
    }

    //--------------------------------------------------------------------------------------------//
    /*
     * Helper methods.
     */
    //--------------------------------------------------------------------------------------------//

    /**
     * DOC
     */
    public String createLifeSpan(Calendar start, Calendar finish){
        return getDate(start) + " - " + getDate(finish);
    }
    /**
     * DOC
     */
    public String getDate(Calendar time){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(time.getTime());
    }
}



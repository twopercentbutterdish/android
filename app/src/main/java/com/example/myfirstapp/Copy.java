package com.example.myfirstapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity(tableName = "copies")
public class Copy {
    @PrimaryKey(autoGenerate = true)
    private long copyId;
    /**
     * Field representing copy's completeness.
     */
    @ColumnInfo(name = "complete")
    private boolean complete;
    /**
     * Time stamp of copy's creation.
     */
    @ColumnInfo(name = "dateCreation")
    private long creation;
    /**
     * Time stamp of copy's purchase.
     */
    @ColumnInfo(name = "datePurchase")
    private long purchase;
    /**
     * String establishing correspondence between listing and #this copy.
     */
    @ColumnInfo(name = "parentListing")
    private String listingName;
    /**
     * Listing's price
     */
    @ColumnInfo(name = "price")
    private double price;


    /**
     * Constructor.
     */
    public Copy(double cost, boolean complete, String parentListing) {
    }

    //--------------------------------------------------------------------------------------------//
    /*
     * Methods.
     */
    //--------------------------------------------------------------------------------------------//

    public long getCopyId() {
        return copyId;
    }

    public void setCopyId(long copyId) {
        this.copyId = copyId;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public long getCreation() {
        return creation;
    }

    public void setCreation(long creation) {
        this.creation = creation;
    }

    public long getPurchase() {
        return purchase;
    }

    public void setPurchase(long purchase) {
        this.purchase = purchase;
    }

    public String getListingName() {
        return listingName;
    }

    public void setListingName(String listingName) {
        this.listingName = listingName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //--------------------------------------------------------------------------------------------//
    /*
     * Helper methods.
     */
    //--------------------------------------------------------------------------------------------//
}


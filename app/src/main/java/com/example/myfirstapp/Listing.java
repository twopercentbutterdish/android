package com.example.myfirstapp;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

public class Listing {
    /**
     * Representation of {@code this}.
     */
    private Map.Entry<String, Queue<Copy>> game;
    /**
     * Constructor.
     */
    public Listing(String name) {
        Queue<Copy> copies = new ArrayDeque<Copy>();
        this.game = new SimpleEntry<>(name, copies);
    }

    //--------------------------------------------------------------------------------------------//
    /*
     * Methods.
     */
    //--------------------------------------------------------------------------------------------//

    /*
     *
     */
    public void addCopy(Copy item){
            Queue<Copy> temp = this.game.getValue();
            temp.add(item);
            this.game.setValue(temp);
    }
    /*
     *
     */
    public Copy sellCopy(){
            Queue<Copy> temp = this.game.getValue();
            Copy removed = temp.remove();
            while (!removed.isComplete()){
                temp.add(removed);
                removed = temp.remove();
            }
        this.game.setValue(temp);
        return removed;
    }
    /*
     *
     */
    public int getQuantity(){
        Queue<Copy> temp = this.game.getValue();
        int size = temp.size();
        this.game.setValue(temp);
        return size;
    }
    /*
     *
     */
    public void changePrice(double newPrice){
        Queue<Copy> temp = this.game.getValue();
        for (int i = 0; i < temp.size(); i++){
            Copy changed = temp.remove();
            changed.changePrice(newPrice);
            temp.add(changed);
        }
    }
    /*
     *
     */
    public void changeName(String newName) {
        Queue<Copy> temp = this.game.getValue();
        this.game = new SimpleEntry(newName, temp);
    }


}

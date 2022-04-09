/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jamith
 */
public class Service {
    private int id;
    private String title;
    private int maxSlots;
    private int pricePerSlot;

    public Service(int id, String title, int maxSlots, int pricePerSlot) {
        this.id = id;
        this.title = title;
        this.maxSlots = maxSlots;
        this.pricePerSlot = pricePerSlot;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxSlots() {
        return maxSlots;
    }

    public void setMaxSlots(int maxSlots) {
        this.maxSlots = maxSlots;
    }

    public int getPricePerSlot() {
        return pricePerSlot;
    }

    public void setPricePerSlot(int pricePerSlot) {
        this.pricePerSlot = pricePerSlot;
    }
}

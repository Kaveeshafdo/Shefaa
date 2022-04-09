/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Jamith
 */
public class Slot {
    private int id;
    private Date time;
    private Date date;
    private boolean isBook;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsBook() {
        return isBook;
    }

    public void setIsBook(boolean isBook) {
        this.isBook = isBook;
    }

    public Service getAllocatedService() {
        return allocatedService;
    }

    public void setAllocatedService(Service allocatedService) {
        this.allocatedService = allocatedService;
    }

    public Patient getAllocatedPatient() {
        return allocatedPatient;
    }

    public void setAllocatedPatient(Patient allocatedPatient) {
        this.allocatedPatient = allocatedPatient;
    }
    private Service allocatedService;
    private Patient allocatedPatient;
}

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
    private String time;
    private String date;
    private boolean isBook;
    private Service allocatedService;
    private Patient allocatedPatient;

    public Slot(int id, String time, String date, boolean isBook, Service allocatedService, Patient allocatedPatient) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.isBook = isBook;
        this.allocatedService = allocatedService;
        this.allocatedPatient = allocatedPatient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

}

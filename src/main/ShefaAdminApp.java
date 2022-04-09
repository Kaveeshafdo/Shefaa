/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import models.*;

/**
 *
 * @author Jamith
 */
public class ShefaAdminApp {

    private List<Patient> patient;
    private List<Service> service;
    private List<Slot> slot;

    public String addPatient(Patient P) {
        return "";
    }

    public String deletePatient(int qid) {
        return "";
    }

    public Patient findPatient(int qid) {
        return null;
    }

    public String modifyPatient(int qid) {
        return "";
    }

    public String addService(Service s) {
        return "";
    }

    public String deleteService(String serveTitle) {
        return "";
    }

    public String findService(String serveTitle) {
        return null;
    }

    public String modifyService(int sid) {
        return "";
    }

    public String addEmptySlot() {
        return "";
    }

    public List<Slot> getAvailableSlotsPerServiceByDate(String ServTitle, Date date) {
        return null;
    }

    public void showAllServices() {
    }

    public void showAllPatients() {
    }

    public void showAllSlots() {
    }

    public String deleteSlot(int servID, Date date, Time time) {
        return "";
    }

    public String reserveSlot(int QID, Date date, Time time) {
        return "";
    }

    public List<Slot> findSlotsByDate(Date date) {
        return null;
    }

    public List<Slot> showAvailableSlots() {
        return null;
    }

    public Boolean IsSlotAvailable(String ServName, Date date, Time time) {
        return null;
    }

    public List<Slot> getServiceSlotsStatus(Date date, String ServTitle) {
        return null;
    }
    
    public Boolean getSlotsPerService(String ServName, Date date, Time time){
        return null;
    }
}

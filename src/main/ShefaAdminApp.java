/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.*;

/**
 *
 * @author Jamith
 */
public class ShefaAdminApp {

    private List<Patient> patient = new ArrayList<Patient>();
    private List<Service> service = new ArrayList<Service>();
    private List<Slot> slot = new ArrayList<Slot>();

    public String addPatient(Patient P) {
        patient.add(P);
        return "'" + P.getName() + "' added successfully";
    }

    public String deletePatient(int qid) {
        Patient p = null;
        for (int i = 0; i < patient.size(); i++) {
            p = patient.get(i);
            if (p.getPid() == qid) {
                patient.remove(i);
                return "'" + p.getName() + "' Delete Successfully";
            }
        }
        return "Patient Not Found!";
    }

    public Patient findPatient(int qid) {
        Patient p = null;
        for (int i = 0; i < patient.size(); i++) {
            p = patient.get(i);
            if (p.getPid() == qid) {
                return p;
            }
        }
        return null;
    }

    public String modifyPatient(int qid, String newName, String residenttype) {

        for (int i = 0; i < patient.size(); i++) {
            if (patient.get(i).getPid() == qid) {
                String name = patient.get(i).getName();
                patient.get(i).setName(newName);
                patient.get(i).setResidanceType(residenttype);
                return "'" + name + "' Modified successfully as '"+patient.get(i).getName()+"'";
            }
        }
        return "Patient Not Found!";
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
        for (int i = 0; i < patient.size(); i++) {
            Patient p = patient.get(i);
            System.out.println(p.getPid() + " " + p.getName() + " " + p.getResidanceType());
        }
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

    public Boolean getSlotsPerService(String ServName, Date date, Time time) {
        return null;
    }
}

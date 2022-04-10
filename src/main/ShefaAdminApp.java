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
                String name = p.getName();
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
                return "'" + name + "' Modified successfully as '" + patient.get(i).getName() + "'";
            }
        }
        return "Patient Not Found!";
    }

    public String addService(Service s) {
        service.add(s);
        return "'" + s.getTitle() + "' added successfully";
    }

    public String deleteService(String serveTitle) {
        Service s = null;
        for (int i = 0; i < service.size(); i++) {
            s = service.get(i);
            if (s.getTitle().equals(serveTitle)) {
                String name = s.getTitle();
                service.remove(i);
                return "'" + s.getTitle() + "' Delete Successfully";
            }
        }
        return "Patient Not Found!";
    }

    public Service findService(String serveTitle) {
        Service s = null;
        for (int i = 0; i < service.size(); i++) {
            s = service.get(i);
            if (s.getTitle().equals(serveTitle)) {
                return s;
            }
        }
        return null;
    }

    public String modifyService(int sid, String title, int maxSlots, int pricePerSlot) {
        for (int i = 0; i < service.size(); i++) {
            if (service.get(i).getId() == sid) {
                String name = service.get(i).getTitle();
                service.get(i).setTitle(title);
                service.get(i).setMaxSlots(maxSlots);
                service.get(i).setPricePerSlot(pricePerSlot);
                return "'" + name + "' Modified successfully as '" + service.get(i).getTitle() + "'";
            }
        }
        return "Service Not Found!";
    }

    public String addEmptySlot(String date, String time) {
        slot.add(new Slot(Common.getSlotId(), time, date, false, null, null));
        return "Slot added successfully";
    }

    public List<Slot> getAvailableSlotsPerServiceByDate(String ServTitle, Date date) {
        return null;
    }

    public void showAllServices() {
        for (int i = 0; i < service.size(); i++) {
            Service s = service.get(i);
            System.out.println(s.getId() + " " + s.getTitle() + " " + s.getMaxSlots() + " " + s.getPricePerSlot());
        }
    }

    public void showAllPatients() {
        for (int i = 0; i < patient.size(); i++) {
            Patient p = patient.get(i);
            System.out.println(p.getPid() + " " + p.getName() + " " + p.getResidanceType());
        }
    }

    public void showAllSlots() {
        for (int i = 0; i < slot.size(); i++) {
            Slot p = slot.get(i);
            System.out.println(p.getId() + " " + p.getDate() + " " + p.getTime()
                    + " " + p.getAllocatedPatient().getName() + " " + p.getAllocatedService().getTitle() + " " + p.isIsBook());
        }
    }

    public String deleteSlot(int servID, String date, String time) {
        Slot p = null;
        for (int i = 0; i < patient.size(); i++) {
            p = slot.get(i);
            if (p.getAllocatedService().getId() == servID && p.getDate().equals(date) && p.getTime().equals(time)) {

                slot.remove(i);
                return "Slot Delete Successfully";
            }
        }
        return "Slot not found!";
    }

    public String reserveSlot(int QID, Date date, Time time) {
        return "";
    }

    public List<Slot> findSlotsByDate(String date) {
        List<Slot> list = new ArrayList<Slot>();
        for (int i = 0; i < slot.size(); i++) {
            if (slot.get(i).getDate().equals(date)) {
                list.add(slot.get(i));
            }
        }
        return list;
    }

    public List<Slot> showAvailableSlots() {
        List<Slot> list = new ArrayList<Slot>();
        for (int i = 0; i < slot.size(); i++) {
            if (!slot.get(i).isIsBook()) {
                list.add(slot.get(i));
            }
        }
        return list;
    }

    public Boolean IsSlotAvailable(String ServName, String date, String time) {
        Slot p = null;
        for (int i = 0; i < patient.size(); i++) {
            p = slot.get(i);
            if (p.getAllocatedService().getTitle().equals(ServName) && p.getDate().equals(date) && p.getTime().equals(time)) {
                return true;
            }
        }
        return false;
    }

    public List<Slot> getServiceSlotsStatus(String date, String ServTitle) {
        List<Slot> list = new ArrayList<Slot>();
        for (int i = 0; i < slot.size(); i++) {
            if (slot.get(i).getDate().equals(date) && slot.get(i).getAllocatedService().getTitle().equals(ServTitle)) {
                list.add(slot.get(i));
            }
        }
        return list;
    }

    public List<Slot> getSlotsPerService(String ServTitle) {
        List<Slot> list = new ArrayList<Slot>();
        for (int i = 0; i < slot.size(); i++) {
            if (slot.get(i).getAllocatedService().getTitle().equals(ServTitle)) {
                list.add(slot.get(i));
            }
        }
        return list;
    }
}

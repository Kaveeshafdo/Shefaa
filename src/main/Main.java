/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import models.Patient;

/**
 *
 * @author Kaveesha FDO
 */
class Menu {

    private int num;

    public void setMenu(int num) {
        this.num = num;
    }

    public int getMenu() {
        return this.num;
    }
}

public class Main {

    static Patient patient = new Patient();

    public static void main(String[] args) {

        ShefaAdminApp shefaa = new ShefaAdminApp();
        Menu menu = new Menu();
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println(
                    "Please enter option number");
            System.out.println(
                    "(1) - Patient");
            System.out.println(
                    "(2) - Service");
            System.out.println(
                    "(3) - Slot");
            System.out.println(
                    "(4) - Exit");
            int optionNumber = sc.nextInt();
            menu.setMenu(optionNumber);
            switch (menu.getMenu()) {
                case 1:

                    System.out.println("Please enter suboption number");
                    System.out.println("(1) - Add Patient");
                    System.out.println("(2) - Delete Patient");
                    System.out.println("(3) - Find Patient");
                    System.out.println("(4) - Modify Patient");
                    System.out.println("(5) - Show all Patient");
                   
                    int patientSubOptionNumber = sc.nextInt();

                    switch (patientSubOptionNumber) {
                        case 1:

                            System.out.println("Please Enter Patient Id");
                            int patientIdNumber = sc.nextInt();
                            System.out.println("Please Enter Patient Name");
                            String patientName = sc.next();
                            System.out.println("Please Enter Patient ResidanceType Number");
                            System.out.println("(1) - VISITOR");
                            System.out.println("(2) - RESIDENT");
                            int residanceTypeNumber = sc.nextInt();
                            if (residanceTypeNumber == 1) {
                                patient.setResidanceType("VISITOR");
                            } else {
                                patient.setResidanceType("RESIDENT");
                            }

                            Patient p = new Patient(patientIdNumber, patientName, patient.getResidanceType());
                            System.out.println(shefaa.addPatient(p));

                        case 2:
                            shefaa.deletePatient(1);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            shefaa.showAllPatients();
                            break;
                       
                    }
                    break;
                case 2:
                    System.out.println("Please enter suboption number");
                    System.out.println("(1) - Add Service");
                    System.out.println("(2) - Delete Service");
                    System.out.println("(3) - Find Service");
                    System.out.println("(4) - Modify Service");
                    System.out.println("(5) - Back");
                    int ServiceSubOptionNumber = sc.nextInt();

                    switch (ServiceSubOptionNumber) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Please enter suboption number");
                    System.out.println("(1) - Add Patient");
                    System.out.println("(2) - Delete Patient");
                    System.out.println("(3) - Find Patient");
                    System.out.println("(4) - Modify Patient");
                    System.out.println("(5) - Back");
                    break;
                    
                case 4:
                    break;
            }
        } while (menu.getMenu() != 4);
        
    }

}

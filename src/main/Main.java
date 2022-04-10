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
public class Main extends ShefaAdminApp {

    public static void main(String[] args) {

        ShefaAdminApp shefaa = new ShefaAdminApp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter option number");
        System.out.println("(1) - Patient");
        System.out.println("(2) - Service");
        System.out.println("(3) - Slot");
        int optionNumber = sc.nextInt();

        switch (optionNumber) {
            case 1:
//                Scanner sc = new Scanner();
                System.out.println("Please enter suboption number");
                System.out.println("(1) - Add Patient");
                System.out.println("(2) - Delete Patient");
                System.out.println("(3) - Find Patient");
                System.out.println("(4) - Modify Patient");
                System.out.println("(5) - Back");
                int patientSubOptionNumber = sc.nextInt();

                switch (patientSubOptionNumber) {
                    case 1:
                     
                        Patient p = new Patient(1,"Kaveesha","VISITOR");                      
                        shefaa.addPatient(p);
                        shefaa.showAllPatients();

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
        }

    }
}

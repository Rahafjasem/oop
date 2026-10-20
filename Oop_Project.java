/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.util.Scanner;

/**
 *
 * @author DRT
 */
public class Oop_Project {

    /**
     * @param args the command line arguments
     */
     static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     // TODO code application logic here
     Clinic c=new Clinic();
    String choice = "+";
       do{
         Appointmentmenue();
         choice = input.next();
         switch(choice)
         {
             case "Ap":  case "ap":
                 c.addPatient();
                 break;
             case"Dp":   case"dp":
                 c.deletePatient();
                 c.PrintAllPatientInformation();
                  break;
              case "Pp":  case"pp":
                  c.PrintAllPatientInformation();
              break;
               case "Ad":  case"ad":
                   c.addDoctor();
                 break;
             case"Dd":  case"dd":
                 c.deleteDoctor();
                 c.PrintAllDoctorInformation();
                  break;
              case "Pd": case "pd":
                  c.PrintAllDoctorInformation();
              break;
              case "E": case "e":
                  System.exit(0);
                  break;
                  default:
                      System.out.println("No Such choice");
                      
                     
         }
       }
       while(! choice.equalsIgnoreCase("E"));
    }
        public static void Appointmentmenue()
        {
            System.out.println("Select what do you want : ");
            System.out.println("Ap - Add new Patient");
            System.out.println("Dp - Delete Patient ");
            System.out.println("Pp - print Patient information");
            System.out.println("Ad - Add new Doctor");
            System.out.println("Dd - Delete Doctor ");
            System.out.println("Pd - print Doctor information");
            System.out.println("E - Exit ");
            System.out.println("Enter your choice : ");
        }
    }

    


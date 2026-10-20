/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DRT
 */
public class Clinic {
    private String location;
    private String name;
    private ArrayList<Doctor> doctor =new ArrayList<>();
    private ArrayList<Patient> patient = new ArrayList<>();
    private int numberOfDoctor;
    private int numberOfPatient;
    Scanner input = new Scanner (System.in);

    public Clinic() {
        this.location = "Amman";
        this.doctor = doctor;
        this.patient = patient;
        this.name="Unknown";
        this.numberOfDoctor = numberOfDoctor;
        this.numberOfPatient = numberOfPatient;
    }

    public Clinic(String location, ArrayList<Doctor> doctor, ArrayList<Patient> patient, int numberOfDoctor, int numberOfPatient) {
       setDoctor(doctor);
        setPatient(patient);
        setName(name);
        setLocation(location);
        this.numberOfDoctor = numberOfDoctor;
        this.numberOfPatient = numberOfPatient;
    }

   
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
           if ( location.length()>=3 && location!= null)
            this.location =location;
        else
        this.location = "Amman";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
          if ( name.length()>=3 && name!=null )
        this.name = name;
          else
              this.name="Unknown";
    }

    public ArrayList<Doctor> getDoctor() {
        
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }



    public void addDoctor(Doctor d)
    {
        doctor.add(d);
        numberOfDoctor++;
    }
    public void addDoctor(String name,String idnumber, Character gender, String speciality)
    {
        doctor.add(new Doctor(speciality, name, idnumber, gender));
        numberOfDoctor++;
    }
    public void addDoctor()
    {
        Doctor d=new Doctor();
        Clinic c=new Clinic();
        System.out.println("enter Clinic name");
        c.setName(input.next());
          System.out.println("enter Clinic location");
        c.setLocation(input.next());
        System.out.println("Enter doctor name"); 
        d.setName(input.next());
        System.out.println("Enter doctor idnumber"); 
        d.setIdnumber(input.next());
        System.out.println("Enter doctor gender "); 
        d.setGender(input.next().charAt(0));
        System.out.println("Enter doctor speciality"); 
        d.setSpeciality(input.next());
        doctor.add(d);
        numberOfDoctor++;
    }
         
     public void deleteDoctor(String name)
     {
         for (int i=0;i<doctor.size();i++)
         {
             if (doctor.get(i).getName().equals(name) && doctor.get(i).getName() != null)
             {
                 doctor.remove(i);
                 numberOfDoctor--;
             }
         }
     }
     
     public void deleteDoctor()
     {
         System.out.println("Enter doctor name you want to delete");
         String name=input.next();
         for (int i=0;i<doctor.size();i++)
         {
             if (doctor.get(i).getName().equals(name) && doctor.get(i).getName() != null)
             {
                 doctor.remove(i);
                 numberOfDoctor--;
             }
         }
     }
     
    public void addPatient(Patient p)
    {
        patient.add(p);
        numberOfPatient++;
    }
    public void addPatient(String name,String idnumber, Character gender)
    {
        patient.add(new Patient(name, idnumber, gender));
        numberOfPatient++;
    }
    public void addPatient()
    {
        Patient p = new Patient();
          Clinic c=new Clinic();
        System.out.println("enter Clinic name");
        c.setName(input.next());
          System.out.println("enter Clinic location");
        c.setLocation(input.next());
        System.out.println("Enter patient name"); 
        p.setName(input.next());
        System.out.println("Enter patient idnumber"); 
        p.setIdnumber(input.next());
        System.out.println("Enter patient gender "); 
        p.setGender(input.next().charAt(0));
       
        patient.add(p);
        numberOfPatient++;
    }
         
    
     
     public void deletePatient()
     {
         System.out.println("Enter Patient name you want to delete");
         String name=input.next();
         for (int i=0;i<patient.size();i++)
         {
             if (patient.get(i).getName().equals(name) && patient.get(i).getName() != null)
             {
                 patient.remove(i);
                 numberOfPatient--;
             }
         }
     }

    public int getNumberOfDoctor() {
        return numberOfDoctor;
    }

    public int getNumberOfPatient() {
        return numberOfPatient;
    }
    public void PrintAllPatientInformation()
    {
        System.out.println("==================================================");
        System.out.println("Clinic name : "+name);
        System.out.println("Clinic location : "+location);
        System.out.println(" ");
        System.out.printf("%-15S%-20S%-10S","Name","Id Number","Gender");
        for(int i=0; i<patient.size();i++)
        {
            System.out.println(" ");
            System.out.printf("%-15S",patient.get(i).getName());
            System.out.printf("%-20S",patient.get(i).getIdnumber());
            System.out.printf("%-10S",patient.get(i).getGender());
        }
        System.out.println(" ");
        System.out.println("number of patients :"+getNumberOfPatient());
        System.out.println("==================================================");
    }
     public void PrintAllDoctorInformation()
     {
      System.out.println("==================================================");
        System.out.println("Clinic name : "+name);
         System.out.println("Clinic location : "+location);
         System.out.println(" ");
        System.out.printf("%-15S%-20S%-10S%30S","Name","Id Number","Gender","Speciality");
        for(int i=0; i<doctor.size();i++)
        {
            System.out.println(" ");
            System.out.printf("%-15S",doctor.get(i).getName());
            System.out.printf("%-20S",doctor.get(i).getIdnumber());
            System.out.printf("%-10S",doctor.get(i).getGender());
            System.out.printf("%30S",doctor.get(i).getSpeciality());
        }
         System.out.println(" ");
        System.out.println("number of doctors :"+getNumberOfDoctor());
        System.out.println("==================================================");   
         
     }

}


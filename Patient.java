/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;



/**
 *
 * @author DRT
 */
public class Patient {
    private String name;
    private String idnumber;
    private Character gender;


    public Patient() {
        this.name = "No Name";
        this.idnumber = "0";
        this.gender='F';
    }
    

    public Patient(String name, String idnumber, Character gender) {
       setName(name);
        setIdnumber(idnumber);
        setGender(gender);
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
             
        if (name != null && name.length()>=3)
            this.name = name;
        else
            this.name = "No Name";
      
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String Idnumber) {
        
        this.idnumber = Idnumber;
       
    }


    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        gender=Character.toUpperCase(gender);
        switch(gender)
        {
            case 'F': case 'M':
                this.gender= gender;
                break;
            default:
                this.gender = 'F';
        }
        
    }
     public String toString(){
        return "Name : " +name
                
             +"\nID Number : " +idnumber
             +"\nGender : "+ getGender();
             
    }
    
    
    
            
    
}

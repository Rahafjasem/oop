/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**1
 *
 * @author DRT
 */
public class Doctor extends Patient{

    private String speciality;

    public Doctor() {
          super();
        this.speciality = "GP";
      
    }

    public Doctor(String speciality) {
        super();
        setSpeciality(speciality);
    }

    public Doctor(String speciality, String name, String idnumber, Character gender) {
        super(name, idnumber, gender);
        setSpeciality(speciality);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    @Override
    public String toString()
            {
                return "Name : " +getName()
                
             +"\nID Number : " +getIdnumber()
             +"\nGender : "+ getGender()
                        +"\nSpaciality : "+getSpeciality();
            }
}

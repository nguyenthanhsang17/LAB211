/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class DoctorManagement {

    private HashMap<String, Doctor> listDoctor = new HashMap<>();

    public boolean add_Doctor(Doctor doctor) {
        if (listDoctor.containsKey(doctor.getCode())) {
            System.out.println("Doctor code [" + doctor.getCode() + "] is duplicate");
            return false;
        }
        listDoctor.put(doctor.getCode(), doctor);
        return true;
    }

    public boolean deleteDoctor(String code) {
        if (listDoctor.containsKey(code)) {
            listDoctor.remove(code);
            return true;
        } else {
            System.out.println("Doctor code: [" + code + "] doesn’t exist");
            return false;
        }
    }

    public boolean updateDoctor(String Code,
            String Name,
            String Specialization,
            String Availability) {
        if (listDoctor.containsKey(Code)) {
            Doctor old_Doctor = listDoctor.get(Code);

            if (Name != null && !Name.trim().isEmpty()) {
                old_Doctor.setName(Name);
            }
            if (Specialization != null && !Specialization.trim().isEmpty()) {
                old_Doctor.setSpecialization(Specialization);
            }
            
            if(Availability!=null&&!Availability.trim().isEmpty()){
                int Availability_number = Integer.parseInt(Availability);
                old_Doctor.setAvailability(Availability_number);
            }

            listDoctor.put(Code, old_Doctor);
            return true;
        }
        System.out.println("Doctor code doesn’t exist");
        return false;
    }
    
    
    public HashMap<String, Doctor> searchDoctor (String input){
        HashMap<String, Doctor> listFind = new HashMap<>();
        
        Set<Entry<String, Doctor>> doctors = listDoctor.entrySet();
        for (Entry<String, Doctor> entry : doctors) {
            //String key = entry.getKey();
            Doctor value = entry.getValue();
            if(value.getName().toUpperCase().contains(input.toLowerCase())){
                listFind.put(value.getCode(), value);
            }
        }
        return listFind;
    }
    

}

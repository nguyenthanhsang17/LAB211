/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor_management;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class DoctorManagement {

    // tạo hashmap key value,  key lưu code doctor để lưu trữ doctoc dang key code, value là doctor ==> code ko bị trùng
    private HashMap<String, Doctor> listDoctor = new HashMap<>();

    //1 object Doctor
    public boolean add_Doctor(Doctor doctor) {
        // check hashmap chứa key của doctor mới mình truyền vào
        if (listDoctor.containsKey(doctor.getCode())) {
            // in ra thông báo
            System.out.println("Doctor code [" + doctor.getCode() + "] is duplicate");
            // trả về false
            return false;
        }
        // ko có code sẵn thoã mãn điều kiện pút vào hashmap
        listDoctor.put(doctor.getCode(), doctor);
        return true;
    }
    //truyền vào code string 1 biên
    public boolean deleteDoctor(String code) {
        //check xem hashmap có chứa key nào giống code này ko
        if (listDoctor.containsKey(code)) {
            //giống thì xoá 
            listDoctor.remove(code);
            return true;
        } else {
            //in thông báo
            System.out.println("Doctor code: [" + code + "] doesn’t exist");
            return false;
        }
    }
    
    // truyền vào 4 string(khi update user có thể input Availability là blank nếu để int thì lỗi chương trình bên main thì để string cho phép user có thể nhập blank)
    // và check Availability!=null&&!Availability.trim().isEmpty() nếu có nhập ép kiểu Integer.parseInt(Availability); ép kiểu từ string => int
    public boolean updateDoctor(String Code, String Name, String Specialization, String Availability) {
        //check xem hashmap có chứa key nào giống code này ko
        if (listDoctor.containsKey(Code)) {
            //lấy doctor có code đấy 
            Doctor old_Doctor = listDoctor.get(Code);
            
            if (Name != null && !Name.trim().isEmpty()) {
                old_Doctor.setName(Name);
            }
            if (Specialization != null && !Specialization.trim().isEmpty()) {
                old_Doctor.setSpecialization(Specialization);
            }
            //"5" => 5
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
    
    //truyền vào name
    public HashMap<String, Doctor> searchDoctor (String input){
        // tạo list rỗng cb cho những doctor thoã mãn điều kiện sẽ đc đưa vào đây
        HashMap<String, Doctor> listFind = new HashMap<>();
        
        
        //khi dùng hàm listDoctor.entrySet() = > set có phần tử Entry<key value>
        Set<Entry<String, Doctor>> doctors = listDoctor.entrySet();
        for (Entry<String, Doctor> entry : doctors) {
            //String key = entry.getKey();
            Doctor value = entry.getValue();
            //Nghia   =>  Gh
             
            if(value.getName().toUpperCase().contains(input.toUpperCase())){
                listFind.put(value.getCode(), value);
            }
        }
        return listFind;
    }
    

}

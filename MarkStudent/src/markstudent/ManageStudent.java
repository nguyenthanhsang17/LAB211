/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markstudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManageStudent {
    private List<Student>  students = new ArrayList<>();
    
    public void Add(Student student){
        students.add(student);
    }
    
    public List<Student> Getstudents(){
        return students;
    }
    
    
    public HashMap<String, Double> getPercentTypeStudent (){
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        
        for (Student student : students) {
            student.Calculation();
            if(student.getType().equals("A")){
                countA++;
            }
            if(student.getType().equals("B")){
                countB++;
            }
            if(student.getType().equals("C")){
                countC++;
            }
            if(student.getType().equals("D")){
                countD++;
            }
        }
        
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("A", (double)countA/students.size()*100);
        hm.put("B", (double)countB/students.size()*100);
        hm.put("C", (double)countC/students.size()*100);
        hm.put("D", (double)countD/students.size()*100);
        
        return hm;
    }
    
}

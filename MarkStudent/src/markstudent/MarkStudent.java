/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markstudent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class MarkStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputValadate valadate = new InputValadate();
        ManageStudent manageStudent = new ManageStudent();
        do {            
            String Name = valadate.inputValue("Name: ");
            String Class =valadate.inputValue("Class: ");
            double Math = valadate.inputValueDouble("Maths: ", 0, 10, "Maths");
            double Physical = valadate.inputValueDouble("Physical: ", 0, 10, "Physical");
            double Chemistry = valadate.inputValueDouble("Chemistry: ", 0, 10, "Chemistry");
            Student student = new Student(Name, Class, Math, Physical, Chemistry);
            
            manageStudent.Add(student);
            
            String choose = valadate.inputValue("Do you want to enter more student information?(Y/N): ");
            if(choose.equals("Y")){
                continue;
            }else if(choose.equals("N")){
                break;
            }
        } while (true);
        HashMap<String,  Double> vu2 = manageStudent.getPercentTypeStudent();
        List<Student> vu = manageStudent.Getstudents();
        int count =1;
        for (Student student : vu) {
            System.out.println("------ Student"+(count)+" Info ------");
            System.out.println("Name: "+student.getName());
            System.out.println("Classes: "+student.getClass_vu());
            System.out.println("AVG: "+student.getAverage());
            System.out.println("Type: "+student.getType());
            count++;
        }
        
        System.out.println("=============================================");
        
        
        Set<Map.Entry<String,Double>> hung = vu2.entrySet();
        for (Map.Entry<String, Double> entry : hung) {
            System.out.println(entry.getKey()+": "+entry.getValue()+"%");
        }
    }
    
}

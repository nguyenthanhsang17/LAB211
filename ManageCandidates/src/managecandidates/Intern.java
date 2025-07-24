/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managecandidates;

/**
 *
 * @author Admin
 */
public class Intern extends Candidate{
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern() {
    }

    public Intern(String Majors, String Semester, String University_name) {
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    public Intern(String Majors, String Semester, String University_name, int Id, String First_Name, String Last_Name, String Birth_Date, String Address, String Phone, String Email, int type) {
        super(Id, First_Name, Last_Name, Birth_Date, Address, Phone, Email, type);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    
    
    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String University_name) {
        this.University_name = University_name;
    }
    
    
}

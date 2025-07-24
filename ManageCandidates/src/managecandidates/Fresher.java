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
public class Fresher extends Candidate{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher() {
    }

    public Fresher(String Graduation_date, String Graduation_rank, String Education) {
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public Fresher(String Graduation_date, String Graduation_rank, String Education, int Id, String First_Name, String Last_Name, String Birth_Date, String Address, String Phone, String Email, int type) {
        super(Id, First_Name, Last_Name, Birth_Date, Address, Phone, Email, type);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }
    
}

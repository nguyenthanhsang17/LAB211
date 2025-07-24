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
public class Experience extends Candidate{
    private int ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExpInYear, String ProSkill) {
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public Experience(int ExpInYear, String ProSkill, int Id, String First_Name, String Last_Name, String Birth_Date, String Address, String Phone, String Email, int type) {
        super(Id, First_Name, Last_Name, Birth_Date, Address, Phone, Email, type);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
}

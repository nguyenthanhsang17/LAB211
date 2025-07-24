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
public class Candidate {
    private int Id;
    private String First_Name;
    private String Last_Name;
    private String Birth_Date;
    private String Address;
    private String Phone;
    private String Email ;
    private int type;

    public Candidate() {
    }

    public Candidate(int Id, String First_Name, String Last_Name, String Birth_Date, String Address, String Phone, String Email, int type) {
        this.Id = Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Birth_Date = Birth_Date;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public void setBirth_Date(String Birth_Date) {
        this.Birth_Date = Birth_Date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return First_Name + " " + Last_Name + "|=" + Birth_Date + "|" + Address + "|" + Phone + "|" + Email + "|" + type;
    }
    
    
    
    
}

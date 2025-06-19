/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Admin
 */
public class HistoryChangeSalary {
    private String code;
    private String Name;
    private int Age;
    private double Salary;
    
    private String Status;
    
    private String Date;

    public HistoryChangeSalary() {
    }

    public HistoryChangeSalary(String code, String Name, int Age, double Salary, String Status, String Date) {
        this.code = code;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        this.Status = Status;
        this.Date = Date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        String infor = String.format("%-15s %-15s %-15s %-10s %-15s %-10s\n", getCode(), getName(), getAge()+"", getSalary()+"", getStatus(), getDate());
        return infor;
    }
    
    
    
    
}

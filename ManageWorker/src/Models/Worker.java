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
public class Worker {
    private String code;
    private String Name;
    private int Age;
    private double Salary;
    private String work_location;

    public Worker() {
    }

    public Worker(String code, String Name, int Age, double Salary, String work_location) {
        this.code = code;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        this.work_location = work_location;
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

    public String getWork_location() {
        return work_location;
    }

    public void setWork_location(String work_location) {
        this.work_location = work_location;
    }
    
    
    
    
    
    
}

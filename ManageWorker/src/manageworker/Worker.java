/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageworker;

import java.util.ArrayList;
import java.util.List;

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
    //================= history
    private List<Double> SalaryChange; // SalaryChange = null |||||| SalaryChange.add(.....) 
    private List<String> Status;
    private List<String> Date;
    //===============

    
    public Worker() {
    }

    public Worker(String code, String Name, int Age, double Salary, String work_location) {
        this.code = code;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        this.work_location = work_location;
        this.SalaryChange = new ArrayList<>();//SalaryChange = {} SalaryChange.add(.....)  == oke
        this.Status = new ArrayList<>();
        this.Date = Date = new ArrayList<>();
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

    public List<Double> getSalaryChange() {
        return SalaryChange;
    }

    public void setSalaryChange(List<Double> SalaryChange) {
        this.SalaryChange = SalaryChange;
    }

    public List<String> getStatus() {
        return Status;
    }

    public void setStatus(List<String> Status) {
        this.Status = Status;
    }

    public List<String> getDate() {
        return Date;
    }

    public void setDate(List<String> Date) {
        this.Date = Date;
    }
    
    public void AddStatus(String Ststus){
        this.Status.add(Ststus);
    }
    
    public void AddSalaryChange(double  salary){
        this.SalaryChange.add(salary);
    }
    
    public void AddDate(String date){
        this.Date.add(date);
    }
    
    
    public void toStringWorker() {
        int length = Status.size();
        // in ra lich su doi luong cho 1 object
        for (int i = 0; i < length; i++) {
            System.out.printf("%-15s %-15s %-15s %-10s %-15s %-10s\n", code, Name, Age, SalaryChange.get(i), Status.get(i), Date.get(i));
        }
    } 
}

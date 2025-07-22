/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markstudent;

/**
 *
 * @author Admin
 */

public class Student {
    private String Name;
    private String Class;
    private double Math;
    private double Physical;
    private double Chemistry;
    
    private double Average;
    private String Type;
    public Student() {
    }

    public Student(String Name, String Class, double Math, double Physical, double Chemistry) {
        this.Name = Name;
        this.Class = Class;
        this.Math = Math;
        this.Physical = Physical;
        this.Chemistry = Chemistry;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClass_vu() {
        return Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }

    public double getPhysical() {
        return Physical;
    }

    public void setPhysical(double Physical) {
        this.Physical = Physical;
    }

    public double getChemistry() {
        return Chemistry;
    }

    public void setChemistry(double Chemistry) {
        this.Chemistry = Chemistry;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    public void Calculation(){
        double avg = 0;
        avg = getMath()+getChemistry()+getPhysical();
        avg = avg/3;
        setAverage(avg);
        
        if(avg<4){
            setType("D");
        }else if(avg<6){
            setType("C");
        }else if(avg<=7.5){
            setType("B");
        }else{
            setType("A");
        }
    }
    
    
}

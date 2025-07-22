/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsrtprogram;

/**
 *
 * @author Admin
 */
public class Student {
    private String code;
    private String Name;

    public Student() {
    }

    public Student(String code, String Name) {
        this.code = code;
        this.Name = Name;
    }
    
    public void ditnhau(){
        System.out.println("vinh long xa xoi");
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
    
    
}

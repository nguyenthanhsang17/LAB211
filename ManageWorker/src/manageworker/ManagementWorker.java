/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageworker;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManagementWorker {

    private List<Worker> workers = new ArrayList<>();

    private boolean CheckCodeExits(String code) {
        if (workers.size() == 0) {
            return false;
        }
        for (Worker worker : workers) {
            if (worker.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public boolean addWorker(Worker worker) {

        boolean check = CheckCodeExits(worker.getCode());
        //check = true => code ton tai => deo cho vào
        //check = false => code ko ton tai => cho vao
        if (check) {
            return false;
        }
        workers.add(worker);
        return true;
    }

    // "DONW", w1, 300
    public boolean changeSalary(String status, String code, double amount) {
        Worker find = null;
        for (Worker worker : workers) {
            if (worker.getCode().equals(code)) {
                find = worker;
            }
        }
        //check worket ton tai ko null ko,  khac null co
        if (find == null) {
            return false;
        }
        // lay luong hien tai
        double salary = find.getSalary();
        // check tang hay giam
        if (status.equals("DOWN")) {
            //cap nhat luong
            salary = salary - amount;
            //neu giam luong qua luong dang co thif luong ve 0 (ko the luong am)
            if (salary < 0) {
                salary = 0;
            }
        } else {
            //tang luong
            salary = salary + amount;
        }
        //cap nhat luong vao object
        find.setSalary(salary);
        
        // lay ngay hien tai
        Date now = new Date();
        //khai bao string
        String Date_STR = "";
        // khai bao lops ten la SimpleDateFormat lop giup format date => string   day day /  Month  Month / year year year year 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date_STR = sdf.format(now);
        // add lich su
        find.AddSalaryChange(salary);
        find.AddStatus(status);
        find.AddDate(Date_STR);
        
        return true;
    }
    
    public List<Worker> getInfomationSalary(){
        
        Comparator comparator = new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getCode().compareTo(o2.getCode());
            }
        };
        workers.sort(comparator);
        return workers;
    }

}

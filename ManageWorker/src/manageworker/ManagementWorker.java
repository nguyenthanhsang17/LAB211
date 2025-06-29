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
        if (find == null) {
            return false;
        }
        double salary = find.getSalary();
        if (status.equals("DOWN")) {
            salary = salary - amount;
            if (salary < 0) {
                salary = 0;
            }
        } else {
            salary = salary + amount;
        }
        find.setSalary(salary);

        Date now = new Date();

        String Date_STR = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date_STR = sdf.format(now);

        find.AddStatus(status);
        find.AddSalaryChange(salary);
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

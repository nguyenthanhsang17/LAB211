/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage_students_175;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class ManagerStudent {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();

    //private final int SIZE_CHECK =10;
    //FALSE => trung 
    //TRUE => ko trung
    public boolean checkidexits(String id) {
        if (students.size() == 0) {
            return true;
        }
        // duyet tung phan tu trong list
        for (Student student : students) {
            // check xem id cos trong list hay ko => goi tung phan tu goi id ra check equals
            // neu bnag thi sao?? =>
            if (student.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public void Create() {
        int count = 0;

        // dung dowhile de vong la vo han dc
        do {
            System.out.println("======= Input "+(count+1)+": ");
            // nhap thong cac thuoc tinh
            System.out.print("ID: ");
            String id = sc.nextLine().trim();
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Semester: ");
            String semester = sc.nextLine().trim();
            System.out.print("courseName: ");
            String courseName = sc.nextLine().trim();
            //tao doi tuong 
            Student student = new Student(id, name, semester, courseName);
            System.out.println("----"+student);
            if (checkidexits(id) == true) {
                // if ko trung thi add
                students.add(student);
                //dem sau khi add
                count++;
            } else {
                // if trung ko add
                System.out.println("Id Duplicate !!!");
                // nhap lai => chay code dong 44
                continue;
            }
            //check count >= 10
            //count = 10
            if (count >= 3) {
                //in ra thong bao
                System.out.print("Do you want to continue (Y/N)?: ");
                // nhap
                String choose = sc.nextLine();
                // check xem tiep hay ko 
                if (choose.equalsIgnoreCase("Y")) {
                    // neu y nhap tiep => chay code 44
                    continue;
                } else {
                    // dung vong lap
                    break;
                }
            }
        } while (true);
    }

    public void findAndSort() {
        // nhap ten 
        // tai sao find trc sort 
        // de giam bot so luong cua list sort hieu qua hon
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        ArrayList<Student> students_find = new ArrayList<>();
        //ArrayList<Student> students_find = null  lỗi students_find
        for (Student student : students) {
            if (student.getStudentName().contains(name)) {
                students_find.add(student);
            }
        }
        Comparator compare = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getStudentName().compareTo(o1.getStudentName());
            }
        };

        Collections.sort(students_find, compare);
        for (Student student : students_find) {
            System.out.println(student);
        }
    }

    public void UpdateAndDelete() {
        // nhap id
        System.out.println("ID: ");
        String id = sc.nextLine().trim();
        //duyet qua
        Student find = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                find = student;
            }
        }
        // neu find ko tim thay ko chay code dong 116 => find van la null
        if (find == null) {
            System.out.println("id no exits !!!");
        }

        System.out.print("Do you want to update (U) or delete (D) student: ");
        // nhap
        String choose = sc.nextLine();
        // check xem tiep hay ko 
        if (choose.equalsIgnoreCase("U")) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Semester: ");
            String semester = sc.nextLine().trim();
            System.out.print("courseName: ");
            String courseName = sc.nextLine().trim();
            //tao doi tuong // van de new tao cung nho moi ko tro vao vung nho cu +> giu lai vung nho cu
            //find = new Student(id, name, semester, courseName);
            find.setStudentName(name);
            find.setSemester(semester);
            find.setCourseName(courseName);
        } else {

            students.remove(find);
        }
    }

    public void report() {
        //tao hashmap // giong count letter /// vi minh phải di dem ten + course
        HashMap<String, Integer> hashMap = new HashMap<>();
        //dungf vong for check xem key String(name course) xem cos trong map ko
        for (Student student : students) {
            //check xem key String(name course) xem cos trong map ko
            if (!hashMap.containsKey(student.getStudentName() + "   " + student.getCourseName())) {
//                
                hashMap.put(student.getStudentName() + "   " + student.getCourseName(), 1);
            } else {
                //neu chưa có put vào map vưới count = 0

                int count = hashMap.get(student.getStudentName() + "   " + student.getCourseName());
                count++;
                hashMap.put(student.getStudentName() + "   " + student.getCourseName(), count);
            }
        }

        Set<Map.Entry<String, Integer>> studentSS = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : studentSS) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

}

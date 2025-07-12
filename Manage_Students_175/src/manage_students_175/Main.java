/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage_students_175;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ManagerStudent managerStudent = new ManagerStudent();
        do {
            System.out.println("1.	Create\n"
                    + "2.	Find and Sort\n"
                    + "3.	Update/Delete\n"
                    + "4.	Report\n"
                    + "5.	Exit\n");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    managerStudent.Create();
                    break;
                case 2:
                    managerStudent.findAndSort();
                    break;
                case 3:
                    managerStudent.UpdateAndDelete();
                    break;
                case 4:
                    managerStudent.report();
                    break;
                default:
                    throw new AssertionError();
            }
            if (choice == 5) {
                break;
            }
        } while (true);
    }
}

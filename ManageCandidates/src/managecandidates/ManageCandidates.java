/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managecandidates;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManageCandidates {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Manager manager = new Manager();
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                    + "1.	Experience\n"
                    + "2.	Fresher\n"
                    + "3.	Internship\n"
                    + "4.	Searching\n"
                    + "5.	Exit");
            System.out.println("Choose option : ");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    manager.CreateCandidate(0);
                    break;
                case 2:
                    manager.CreateCandidate(1);
                    break;
                case 3:
                    manager.CreateCandidate(2);
                    break;
                case 4:
                    manager.Search();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (true);
    }

}

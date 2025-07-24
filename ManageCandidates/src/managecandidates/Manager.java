/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managecandidates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {

    private Scanner sc = new Scanner(System.in);
    private List<Candidate> candidates = new ArrayList<>();

    public void CreateCandidate(int type) {
        do {
            System.out.print("Enter id: ");
            String id = sc.nextLine().trim();
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine().trim();
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine().trim();
            System.out.print("Enter birth date: ");
            String birthDate = sc.nextLine().trim();
            System.out.print("Enter address: ");
            String address = sc.nextLine().trim();
            System.out.print("Enter phone: ");
            String phone = sc.nextLine().trim();
            System.out.print("Enter email: ");
            String email = sc.nextLine().trim();

            if (type == 2) {
                System.out.print("Enter Major: ");
                String Major = sc.nextLine().trim();
                System.out.print("Enter Semester: ");
                String Semester = sc.nextLine().trim();
                System.out.print("Enter University Name: ");
                String University_name = sc.nextLine().trim();

                Intern intern = new Intern(Major, Semester, University_name, type, firstName, lastName, birthDate, address, phone, email, type);
                candidates.add(intern);
            } else if (type == 1) {
                System.out.print("Enter Graduation Date: ");
                String Graduation_date = sc.nextLine().trim();
                System.out.print("Enter Graduation Rank: ");
                String Graduation_rank = sc.nextLine().trim();
                System.out.print("Enter Education: ");
                String Education = sc.nextLine().trim();

                Fresher fresher = new Fresher(Graduation_date, Graduation_rank, Education, type, firstName, lastName, birthDate, address, phone, email, type);

                candidates.add(fresher);
            } else if (type == 0) {
                System.out.print("Enter Exp In Year: ");
                int ExpInYear = sc.nextInt();
                System.out.print("Enter ProSkill : ");
                String ProSkill = sc.nextLine().trim();
                Experience experience = new Experience(ExpInYear, ProSkill, type, firstName, lastName, birthDate, address, phone, email, type);

                candidates.add(experience);
            }
            System.out.print("Do you want to continue (Y/N)?: ");
            String choose = sc.nextLine().trim();
            if (choose.equals("Y")) {
                continue;
            } else {
                break;
            }

        } while (true);
    }

    public void Search() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : candidates) {
            if (candidate.getType() == 0) {
                System.out.println(candidate.getFirst_Name() + " " + candidate.getLast_Name());
            }
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate candidate : candidates) {
            if (candidate.getType() == 1) {
                System.out.println(candidate.getFirst_Name() + " " + candidate.getLast_Name());
            }
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate candidate : candidates) {
            if (candidate.getType() == 2) {
                System.out.println(candidate.getFirst_Name() + " " + candidate.getLast_Name());
            }
        }

        System.out.print("Input Candidate name (First name or Last name): ");
        String name = sc.nextLine().trim();
        System.out.print("Input type of candidate:  ");
        int type = sc.nextInt();
        System.out.println("The candidates found: ");
        for (Candidate candidate : candidates) {
            String fullname  = candidate.getFirst_Name() + " " + candidate.getLast_Name();
            if(fullname.toUpperCase().contains(name.toUpperCase()) && candidate.getType()==type){
                System.out.println(candidate);
            }
        }
        
        

    }

}

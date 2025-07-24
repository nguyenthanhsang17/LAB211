/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageexpen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManageExpen {

    private static final Scanner in = new Scanner(System.in);
    private static final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";
    private static ArrayList<Expenses> le = new ArrayList<>();
    
    private void addExpense(int id) {
        System.out.print("Enter Date: ");
        String date = in.nextLine().trim();
        System.out.print("Enter Amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter Content: ");
        String content = in.nextLine().trim();
        le.add(new Expenses(id, date, amount, content));
    }

    private void displayExpense() {
        if (le.size() == 0) {
            System.err.println("List Expenses empty");
            return;
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getAmount(), le.get(i).getContent());
            total += le.get(i).getAmount();
        }
        System.out.printf("Total: %-20.0f\n", total);
    }

    private int checkIdExist(ArrayList<Expenses> le, int id) {
        for (int i = 0; i < le.size(); i++) {
            if (le.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private void deleteExpense() {
        System.out.print("Enter id: ");
        int id = in.nextInt();
        int checkIdExist = checkIdExist(le, id);
        if (checkIdExist != -1) {
            le.remove(checkIdExist);
            System.out.println("Delete an expense successful");
            for (int i = id - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }
    }

    private void display() {
        //ArrayList<Expenses> le = new ArrayList<>();
        int id = 0;
        while (true) {
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    addExpense(++id);
                    break;
                case 2:
                    displayExpense();
                    break;
                case 3:
                    deleteExpense();
                    id--;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ManageExpen manageExpen = new ManageExpen();
        manageExpen.display();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageworker;

import java.util.List;

/**
 *
 * @author Admin
 */
public class ManageWorker {

    /**
     * @param args the command line arguments
     */
    public static void PrintMenu() {
        System.out.println("======== Worker Management =========\n"
                + "1.	Add Worker\n"
                + "2.	Up salary\n"
                + "3.	Down salary\n"
                + "4.	Display Information salary\n"
                + "5.	Exit");
    }

    public static void main(String[] args) {
        InputValidate inputValidate = new InputValidate();
        ManagementWorker manageWorker = new ManagementWorker();
        int choose = 0;
        do {
            PrintMenu();
            choose = inputValidate.inputValueInt("Choose option: ", 1, 5);
            if (choose == 5) {
                break;
            }

            switch (choose) {
                case 1:
                    System.out.println("--------- Add Worker ----------");
                    String code = inputValidate.inputValue("Enter Code:");
                    String name = inputValidate.inputValue("Enter Name:");
                    int age = inputValidate.inputValueInt("Enter Age:", 0, Integer.MAX_VALUE);
                    double salary = inputValidate.inputValueDouble("Enter Salary: ", 0);
                    String Location = inputValidate.inputValue("Enter work location: ");
                    Worker worker = new Worker(code, name, age, salary, Location);
                    boolean check = manageWorker.addWorker(worker);
                    if (check) {
                        System.out.println("succees");
                    } else {
                        System.out.println("failed");
                    }
                    break;
                case 2:
                    System.out.println("------- Up/Down Salary --------");
                    String code_change = inputValidate.inputValue("Enter Code:");
                    double salaryChange = inputValidate.inputValueDouble("Enter Salary: ", 0);

                    boolean check_1 = manageWorker.changeSalary("UP", code_change, salaryChange);
                    System.out.println(check_1);
                    break;
                case 3:
                    System.out.println("------- Up/Down Salary --------");
                    String code_change_1 = inputValidate.inputValue("Enter Code:");
                    double salaryChange_2 = inputValidate.inputValueDouble("Enter Salary: ", 0);

                    boolean check_2 = manageWorker.changeSalary("DOWN", code_change_1, salaryChange_2);
                    System.out.println(check_2);
                    break;
                case 4:
                    List<Worker> workers = manageWorker.getInfomationSalary();
                    System.out.println("--------------------Display Information Salary-----------------------");
                    //Code 	Name	 	Age    	Salary		Status  	Date
                    System.out.printf("%-15s %-15s %-15s %-10s %-15s %-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
                    for (Worker worker1 : workers) {
                        worker1.toStringWorker();
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        } while (true);
    }

}

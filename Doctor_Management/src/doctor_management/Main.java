/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor_management;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputValidate inputValidate = new InputValidate();
        DoctorManagement management = new DoctorManagement();
        View view = new View();
        int chooseOption = 0;
        do {
            view.PrintMenu();
            chooseOption = inputValidate.inputValueInt("Choose option: ", 1, 5);

            switch (chooseOption) {
                case 1:
                    System.out.println("--------- Add Doctor ----------");
                    String code = inputValidate.inputValue("Enter Code: ");
                    String Name = inputValidate.inputValue("Enter Name: ");
                    String Specialization = inputValidate.inputValue("Enter Specialization: ");
                    int Availability = inputValidate.inputValueInt("Enter Availability: ", 0, Integer.MAX_VALUE);
                    Doctor doctor = new Doctor(code, Name, Specialization, Availability);
                    management.add_Doctor(doctor);
                    break;

                case 2:
                    System.out.println("--------- Update Doctor -------");
                    String codeToUpdate = inputValidate.inputValue("Enter Code: ");
                    String NameToUpdate = inputValidate.inputValueAllowNull("Enter Name: ");
                    String SpecializationToUpdate = inputValidate.inputValueAllowNull("Enter Specialization: ");
                    String AvailabilityToUpdate = inputValidate.inputValueAllowNull("Enter Availability: ");
                    management.updateDoctor(codeToUpdate, NameToUpdate, SpecializationToUpdate, AvailabilityToUpdate);
                    break;
                case 3:
                    System.out.println("--------- Delete Doctor -------");
                    String codeToDelete = inputValidate.inputValue("Enter Code: ");
                    management.deleteDoctor(codeToDelete);
                    break;
                case 4:
                    System.out.println("---------- Search Doctor --------");
                    String search = inputValidate.inputValueAllowNull("Enter text: ");
                    System.out.println("--------- Result ------------");
                    HashMap<String, Doctor> Find = management.searchDoctor(search);
                    if (Find.size() == 0) {
                        System.out.println("deo cos !!!");
                    } else {
                        System.out.printf("%-15s %-15s %-15s %-10s\n", "Code", "Name", "Specialization", "Availability");
                        Set<Map.Entry<String, Doctor>> doctors = Find.entrySet();
                        for (Map.Entry<String, Doctor> entry : doctors) {
                            //String key = entry.getKey();
                            Doctor value = entry.getValue();
                            System.out.printf("%-15s %-15s %-15s %-10s\n", value.getCode(), value.getName(), value.getSpecialization(), value.getAvailability() + "");
                        }
                    }

                    break;
                default:
                    throw new AssertionError();
            }

            if (chooseOption == 5) {
                break;
            }
        } while (true);
    }

}

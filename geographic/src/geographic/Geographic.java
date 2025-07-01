/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geographic;

import Controller.InputValidate;
import View.ManageEastAsiaCountries;
import Model.EastAsiaCountries;
import View.View;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Geographic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View View = new View();
        InputValidate inputValidate = new InputValidate();
        ManageEastAsiaCountries manageEastAsiaCountries = new ManageEastAsiaCountries();
        int choice = 0;
        do {     
            View.PrintMenu();
            choice = inputValidate.inputValueInt("Enter your choices: ", 1, 5);
            switch (choice) {
                case 1:
                    String Code = inputValidate.inputValue("Enter code of country: ");
                    String name  = inputValidate.inputValue("Enter name of country: ");
                    float Area = inputValidate.inputValueFloat("Enter total Area: ", 0);
                    String terrain  = inputValidate.inputValue("Enter terrain of country: ");
                    EastAsiaCountries eac = new EastAsiaCountries(terrain, Code, name, Area);
                    manageEastAsiaCountries.addCountryInformation(eac);
                    break;
                case 2:
                    EastAsiaCountries eac1 = manageEastAsiaCountries.getRecentlyEnteredInformation();
                    System.out.println("ID              Name            Total Area      Terrain         ");
                    eac1.display();
                    break;
                case 3:
                    String nameSearch = inputValidate.inputValue("Enter the name you want to search for: ");
                    List<EastAsiaCountries> list = manageEastAsiaCountries.searchInformationByName(nameSearch);
                    System.out.println("ID              Name            Total Area      Terrain         ");
                    for (EastAsiaCountries eastAsiaCountries : list) {
                        eastAsiaCountries.display();
                    }
                    break;
                case 4:
                    List<EastAsiaCountries> list1 = manageEastAsiaCountries.sortInformationByAscendingOrder();
                    System.out.println("ID              Name            Total Area      Terrain         ");
                    for (EastAsiaCountries eastAsiaCountries : list1) {
                        eastAsiaCountries.display();
                    }
                    break;
                    
                default:
                    throw new AssertionError();
            }
            if(choice==5){
                break;
            }
        } while (true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EastAsiaCountries;
import com.sun.javafx.css.Combinator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManageEastAsiaCountries {

    private List<EastAsiaCountries> countrieses = new ArrayList<>();
    private EastAsiaCountries justInput = null;

    private boolean checkIdExists(String id) {
        //ABC abc
        boolean check = true;
        for (EastAsiaCountries countriese : countrieses) {
            if (countriese.getCountryCode().equalsIgnoreCase(id)) {
                check = false;
                break;
            }
        }
        return check;
    }

    public boolean addCountryInformation(EastAsiaCountries countries) {
        boolean check = checkIdExists(countries.getCountryCode());
        if (!check) {
            return false;
        }
        countrieses.add(countries);
        justInput = countries;
        return true;
    }
    //Viet Nam = > VIET NAM
    //viet     => VIET

    public List<EastAsiaCountries> searchInformationByName(String name) {
        List<EastAsiaCountries> AfterSearch = new ArrayList<>();
        for (EastAsiaCountries countriese : countrieses) {
            if (countriese.getCountryName().toUpperCase().contains(name.toUpperCase())) {
                AfterSearch.add(countriese);
            }
        }
        return AfterSearch;
    }

    public List<EastAsiaCountries> sortInformationByAscendingOrder() {
        Comparator compare = new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
//                if (o1.getTotalArea() < o2.getTotalArea()) {
//                    return -1;
//                } else if (o1.getTotalArea() > o2.getTotalArea()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
                return o2.getCountryName().compareTo(o1.getCountryName());
            }
        };

        Collections.sort(countrieses, compare);
        return countrieses;
    }

    public EastAsiaCountries getRecentlyEnteredInformation() {
        return justInput;
    }
}

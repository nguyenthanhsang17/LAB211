/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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

    // tạo list lưu trữ EastAsiaCountries
    private List<EastAsiaCountries> countrieses = new ArrayList<>();
    private EastAsiaCountries justInput = null;

    private boolean checkIdExists(String id) {
        //ABC abc khai báo bien
        boolean check = true;
        //duyet list EastAsiaCountries
        for (EastAsiaCountries countriese : countrieses) {
            if (countriese.getCountryCode().equalsIgnoreCase(id)) {
                // true tồn tại
                check = true;
                break;
            }
        }
        return false;
    }

    public boolean addCountryInformation(EastAsiaCountries countries) {
        // kiểm tra code để xem code tồn tại ko countries vào list 
        boolean check = checkIdExists(countries.getCountryCode());
        // tồn tại check =>  true => ko cho countries vào list countrieses
        // nguoc lai false => ko tồn tại => đc vao list
        // kiêm tra 
        if (check == true) {
            return false;
        } else {
            countrieses.add(countries);
            justInput = countries;
            return true;
        }
    }

    public List<EastAsiaCountries> searchInformationByName(String name) {
        // cb bi lisst đưa phan tu thoa man dieu kien name 
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

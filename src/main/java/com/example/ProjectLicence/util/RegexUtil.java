package com.example.ProjectLicence.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static Boolean validatePlate(String plate){
        Pattern platePattern = Pattern.compile("[0-9]+[a-zA-Z]+[0-9]");
        Matcher matcher = platePattern.matcher(plate);

        return matcher.matches();
    }
}

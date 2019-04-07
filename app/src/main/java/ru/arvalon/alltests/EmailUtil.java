package ru.arvalon.alltests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by arvalon on 09.02.2018.
 */

public class EmailUtil {

    private static final String IPADDRESS_PATTERN =
            "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";


    public static boolean isEmail(String email){
        return email.contains("@");
    }


    public static boolean isIP(String ip){

        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        if (matcher.find()) {
            return true;
        } else{
            return false;
        }
    }
}

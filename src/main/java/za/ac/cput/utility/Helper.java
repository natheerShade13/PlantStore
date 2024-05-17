package za.ac.cput.utility;

import java.util.Date;
import java.util.UUID;

public class Helper {
    public static boolean isNullorEmpty(String s){
        if(s == null || s.isEmpty())
            return true;
        return false;
    }

    public static boolean isNull(Date date){
        if (date == null)
            return true;
        return false;
    }

    public static boolean isNegative(double a){
        if(a < 0)
            return true;
        return false;
    }

    public static String generatesId(){
        return UUID.randomUUID().toString();
    }
}


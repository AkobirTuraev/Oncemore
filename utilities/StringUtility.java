package com.cbt.utilities;

public class StringUtility {

    public static String Result(String expected, String actual){
       String result=null;
       if (expected.equalsIgnoreCase(actual)){
           result="PASS";
       }else
           result="FAIL";
        return result;
    }

}

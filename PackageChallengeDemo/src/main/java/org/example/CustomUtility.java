package org.example;

public class CustomUtility {
    public static String removeExtraBracketsfromString(String x){

        if(x.startsWith("(")) {
           x=  x.replace("(", "");
        }
        if(x.endsWith(")")){
           x=  x.replace(")", "");
        }
        return x;
    }
}

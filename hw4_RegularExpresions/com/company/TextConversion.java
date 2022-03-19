package com.company;

public class TextConversion {

    public String removePQR(String text){

        return text.replaceAll("([pqr])" , "");
    }

    public String vowelToStar(String text){

        return text.replaceAll("([aeiouAEIOU])", "*");
    }
}

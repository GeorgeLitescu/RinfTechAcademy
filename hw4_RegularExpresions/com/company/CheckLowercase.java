package com.company;

public class CheckLowercase {
    private boolean hasUnderscore = false;
    private boolean isLowercase = false;

    public boolean validate(String name) {
        hasUnderscore = false;
        isLowercase = false;

        if (name == name.toLowerCase())
            isLowercase = true;

        if (name.contains("_"))
            hasUnderscore = true;

        return (hasUnderscore == true && isLowercase == true);

    }
}

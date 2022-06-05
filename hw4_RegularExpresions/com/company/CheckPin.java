package com.company;

public class CheckPin {
    private boolean isCorrectLength;

    public boolean validate(String pin) {
        switch (pin.length()) {     //i know in this situation it would have much shorter to use "if" but i wanted to use "switch" for training
            case 4:
                isCorrectLength = true;
                break;

            case 6:
                isCorrectLength = true;
                break;

            case 8:
                isCorrectLength = true;
                break;

            default:
                isCorrectLength = false;
        }

        return isCorrectLength;
    }
}

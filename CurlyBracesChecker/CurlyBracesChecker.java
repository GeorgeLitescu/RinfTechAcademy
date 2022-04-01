package com.company;

public class CurlyBracesChecker {

    public static boolean check(String subject) {

        int analyzer = 0;

        for (int i = 0; i < subject.length(); i++) {
            if (subject.charAt(i) == '{')
                analyzer++;

            else if (subject.charAt(i) == '}')
                analyzer--;

            if (analyzer < 0)  //this means that there is a closed braced before an open one (ex: "}}{{")
                return false;
        }

        if (analyzer == 0) return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(check("{{{}}}{}{{}}"));
        System.out.println(check("{{{}}}{}{{}"));
        System.out.println(check("}{}{{}"));
        System.out.println(check("{{}}{}"));
        System.out.println(check("{{{}}"));
    }
}

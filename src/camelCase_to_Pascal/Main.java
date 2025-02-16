package camelCase_to_Pascal;

import java.util.Arrays;

/**
 * Complete the method/function so that it converts dash/underscore
 * delimited words into camel casing. The first word within
 * the output should be capitalized only if the original
 * word was capitalized (known as Upper Camel Case, also often
 * referred to as Pascal case). The next words should be always capitalized.
 *
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 *
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 *
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class Main {

    public static void main(String[] args) {

        String s1 = "the-stealth-warrior";
        String s2 = "The_Stealth_Warrior";
        String s3 = "The_Stealth-Warrior";


        System.out.println(toCamelCase(s1));
        System.out.println(toCamelCase(s2));
        System.out.println(toCamelCase(s3));

    }

    public static String toCamelCase(String s){
        String[] tokens = s.split("[_-]");
        String stringToReturn = tokens[0];
        for(int i = 1 ; i < tokens.length ; i++){
            stringToReturn += Character.toUpperCase(tokens[i].charAt(0));
            stringToReturn += tokens[i].substring(1);
        }
        return stringToReturn;
    }

    static String toCamelCase2(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    public static void printTable(String[] tokens){
    for (String token : tokens){
        System.out.print(token + " ");
    }
    }
}



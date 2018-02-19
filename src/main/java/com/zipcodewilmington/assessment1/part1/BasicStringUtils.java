package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        Character firstChar = str.charAt(0);
        String firstCharacter = firstChar.toString().toUpperCase();
        return firstCharacter + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        //maybe use the camelCase method..use your methods Katrice
        String reverseStr = reverse(str);
        return camelCase(reverseStr);
    }



    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        //maybe return new StringBuilder(str).deleteCharAt(int index).toString();
//        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder(str);
        //deletes first character, was a success when test run
        sb.deleteCharAt(0);
        //deletes the last character, just like an array...remember that.
        sb.deleteCharAt(sb.length()-1);
        //now we need to turn sb back into a string and return it.
        return sb.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        //I was thinking to create an array, but I have to break it into char's
        //if the char array index n of str is capitalized then lowercase
        //else if char array index n of str is lowercased then uppercase
        return null;
    }
}

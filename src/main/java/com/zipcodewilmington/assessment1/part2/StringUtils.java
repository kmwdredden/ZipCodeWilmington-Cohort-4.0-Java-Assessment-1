package com.zipcodewilmington.assessment1.part2;

import javax.sound.midi.Soundbank;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] words = sentence.split(" ");

        String answer = String.join(", ", words);
        System.out.println(answer);
        String[] newArray = answer.split(" , ");
        //StringBuilder sb = new StringBuilder(answer);




        return newArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] words = sentence.split(" ");
        return words[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];
        StringBuilder sb = new StringBuilder(firstWord);
        return sb.reverse().toString();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        //so I thought I would split the sentence by space
        //then get the first word at index 0
        //from there create a stringbuilder
        //reverse and return a string, couldn't for the life of me figure ou the first letter capital thing
        String [] word = sentence.split(" ");
        String firstWord = word[0];
        //StringBuilder sb2 = new StringBuilder(firstWord);
        String reversedWord = reverseFirstWord(firstWord);
        return camelCase(reversedWord);




    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        return str.substring(0,index) + str.substring(index + 1);
    }










    public static String camelCase(String str) {

        Character firstChar = str.charAt(0);
        String firstCharacter = firstChar.toString().toUpperCase();
        return firstCharacter + str.substring(1);
    }






}

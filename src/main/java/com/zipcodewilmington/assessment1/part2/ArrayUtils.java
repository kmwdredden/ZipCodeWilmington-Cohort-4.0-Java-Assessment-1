package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int countOccurence = 0;
        for (Object myObject : objectArray){
            if(myObject.equals(objectToCount))
                countOccurence++;
        }
        return countOccurence;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //pseudocode - just like the lab you already did, still break it down to understand it

        //to hold the size of the array, we already created a getNOfOccurences, no need to repeat
        int newSize = objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] valueArray = new Integer[newSize];

        int indexNotDuplicates = 0;

        for (int i =0; i<objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)){
                valueArray[indexNotDuplicates] = (int)objectArray[i];
                indexNotDuplicates++;
            }

        }

        return valueArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
    //pseudocode
        //if it appears more than any other index in the arry
        //hold it and
        // then return the holder
        ArrayList<Object> count = new ArrayList();

        int duplicates = 0;

        if(objectArray[0].equals(objectArray[1]));
            count.add(objectArray[0]);


        for(int i = 1; i <objectArray.length; i++){
            if(!objectArray[i].equals(objectArray[i-1])){
                //count.add(objectArray[i]);
                count.set(duplicates, objectArray[i]);
                duplicates++;
            }
        }

//        Integer[] duplicates = new Integer[count.size()];
//        count.toArray(duplicates);
        //trying to convert this Integer duplicates array to a int so it can return the value
        //come back to
//        int answer = duplicates.intValue();//didn't work


        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

//        int holder = 0;
//        for(int i =0; i<objectArray.length; i++){
//            if(objectArray[i]<=holder){
//                holder++;
//            }
//        }

        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Object newArrayLength = objectArray.length + objectArrayToAdd.length;
        Object[] answer = new Object[(int)newArrayLength];

        return answer;
    }
}

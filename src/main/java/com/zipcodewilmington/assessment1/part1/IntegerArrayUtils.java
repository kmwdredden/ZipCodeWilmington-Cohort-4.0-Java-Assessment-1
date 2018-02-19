package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int total = 0;
        for (int i = 0; i < intArray.length; i++){
            total += intArray[i];
        }

        return total;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        //don't know why this isn't working, should be the same as up top
        int productTotal = 1;
        for (int i = 0; i <intArray.length; i++){
            productTotal = productTotal * intArray[i];

        }
        return productTotal;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int total = 0;
        int avgTotal = 0;
        for (int i = 0; i < intArray.length; i++) {
            total += intArray[i];
            avgTotal = (int) ((double)total / intArray.length);
        }
        return Double.valueOf(avgTotal);
    }
}

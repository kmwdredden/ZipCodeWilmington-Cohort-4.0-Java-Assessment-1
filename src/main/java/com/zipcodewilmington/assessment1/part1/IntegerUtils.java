package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        //Given an Integer , n, return the sum of all integers between 0 and not including n.
        //pseudo-code
        //if holder number is less than or equal to n then
        //add them until you reach n
        //you have to
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i<=n){
                sum += i;
            }
        }

        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        //pseudo-code
        //okay we definitely need a loop
        //if holder number is less than or equal to n then
        //multiply until you reach n
        //you have to start at 1, if you multiply by 0 you'll just keep getting 0
        int productOfNumber = 1;
        for(int i = 1; i <= n; i++){
            if(i <= n);
                productOfNumber *= i;
        }
        return productOfNumber;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        ArrayList<Integer> backwards = new ArrayList<>(val);

        for(int i =0; i < backwards.length-1; i>=0 i--)
        return null;
    }
}

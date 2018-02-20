package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
//        create an Array list because you don't know how big the new array will be since technically you can't see
        //the test in real life
//        go through a loop
//        if i%2 ==0
//        put in holder
//        return odd values


        ArrayList<Integer> evenNumbers = new ArrayList();
        for(int i =0; i <ints.length; i++){
            if(ints[i]%2==0){
                evenNumbers.add(i);
            }
        }
        return evenNumbers.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int holder = 0;
       //can't seem to get the last index dont know why.
        ArrayList<Integer> oddNumbers = new ArrayList();
        for(int i =1; i <ints.length; i++){
            if(ints[i] % 2 != 0){
                oddNumbers.add(i);
            }
        }


        return oddNumbers.toArray(new Integer[0]);


    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Object[] deleteMultiplesOf3(Integer[] ints) {
        //pseudocode
        //create an array to hold nonmultiplesof3
        //create a int holder
        //loop through ints
        //if i %3 ==0
        //store in holder
        //put other elements in new array
        //return new array

        ArrayList<Integer> temp = new ArrayList();
        int holder = 0;

        for(int i : ints){
            if(ints[i] %3 ==0){
                holder++;
            }else{
                temp.add(i);
            }
        }

        //how to return the temp, keep getting errors, moving on.
        //tried converting it to an array, but just not working.
        Object[] nonMultiples = temp.toArray(new Object[temp.size()]);
        return nonMultiples;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
}

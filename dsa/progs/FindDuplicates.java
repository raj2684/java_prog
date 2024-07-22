package dsa.progs;

import java.util.*;

/*
Given an array of n elements that contains elements from 0 to n-1,
with any of these numbers appearing any number of times.
Find these repeating numbers in O(n) and use only constant memory space.

Note: The repeating element should be printed only once.
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 6, 5, 2, 3, 3, 2};
        List<Integer> dupInts = duplicates(a);

        for (Integer dupInt : dupInts) {
            System.out.println(dupInt);
        }


    }

    private static List<Integer> duplicates(int[] a) {
        Set<Integer> numberSet = new HashSet<>();
        List<Integer> listOfDups = new ArrayList<>();

        for (int j : a) {
            boolean added = numberSet.add(j);

            if (!added) {
                listOfDups.add(j);
            }
        }

        return listOfDups;

    }
}

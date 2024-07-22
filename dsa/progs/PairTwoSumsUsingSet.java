package dsa.progs;

import java.util.HashSet;

public class PairTwoSumsUsingSet {
    public static void main(String[] args) {
      int[] arr = { 1, 4, 45, 6, 10, 8 };
      int sum = 23;
      System.out.println(printSum(arr, sum));
      sum = 16;
      System.out.println(printSum(arr, sum));
    }

    private static String printSum(int[] arr, int sum) {
        HashSet<Integer> setOfData = new HashSet<>();
        int temp ;
        for (int j : arr) {
            if (sum > j) {
                temp = sum - j;
                if (setOfData.contains(temp)) {
                    return "Yes";
                }
                setOfData.add(j);
            }

        }
        return "No";
    }
}

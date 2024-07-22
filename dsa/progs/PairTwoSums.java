package dsa.progs;
/*
Given an array A[] of n numbers and another number x,
the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
O(n2)
 */
public class PairTwoSums {
    static boolean chkPair(int[] arr, int size, int x)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {

        int[] arr = { 0, -1, 2, -3, 1 };
        int x = -2;
        int size = arr.length;

        if (chkPair(arr, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

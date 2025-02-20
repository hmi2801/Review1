package Bridgelabz_2113100011.Review3;

import java.util.Arrays;

public class QuickSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr, left, right);

    }

    public static int[] merge(int[] arr, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;
        int[] ans = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else if (left[i] > right[j]) {
                ans[k] = right[j];
                j++;
            } else {
                ans[k++] = left[i];
                ans[k] = right[j];
                i++;
                j++;
            }
            k++;
        }

        while (i < left.length) {
            ans[k++] = left[i++];
        }

        while (j < right.length) {
            ans[k++] = right[j++];
        }

        return ans;


    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 2, 1};
        int[] ans = mergeSort(arr);

        System.out.println(Arrays.toString(ans));


    }
}

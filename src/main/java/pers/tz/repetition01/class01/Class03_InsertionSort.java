package pers.tz.repetition01.class01;

import static pers.tz.util.CommonInitUtil.initArray;
import static pers.tz.util.CommonPrintUtil.printArray;

/**
 * <h3>title：插入排序</h3>
 * <h3>特点：</h3>
 * <span>O(n)，不稳定，对于有序结构时间复杂度更低</span>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>0 - N-1   找出最小值   放到0位置上</p>
 * <p>1 - N-1   找出最小值   放到1位置上</p>
 * <p>2 - N-1   找出最小值   放到2位置上</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class03_InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] array = initArray();
        printArray(array);

        insertionSort(array);

        printArray(array);
    }
}

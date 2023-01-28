package pers.tz.util;

import java.util.Random;

/**
 * <p>公共造数方法</p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class CommonInitUtil {

    /**
     * 初始化随机数组
     *
     * @return
     */
    public static int[] initArray() {
        return initArray(10);
    }

    public static int[] initArray(int length) {
        return initArray(length, false);
    }

    public static int[] initArray(boolean isOrder) {
        return initArray(10, true);
    }

    public static int[] initArray(int length, boolean isOrder) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(20);
        }

        if (!isOrder) {
            return array;
        }

        sort(array);
        return array;
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}

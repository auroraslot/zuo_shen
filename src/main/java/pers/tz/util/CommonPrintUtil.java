package pers.tz.util;

/**
 * <p>公共打印方法</p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class CommonPrintUtil {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void printIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void printAll(int[] arr) {
        printArray(arr);
        printIndex(arr);
    }
}

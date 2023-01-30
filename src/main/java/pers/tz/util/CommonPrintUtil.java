package pers.tz.util;

import pers.tz.common.Node;

/**
 * <p>公共打印方法</p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class CommonPrintUtil {

    /* 数组 start */
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
    /* 数组 end */

    /* 链表 start */
    public static void printLinked(Node node) {
        if (node == null) {
            return;
        }

        while (node != null) {
            System.out.print(node.value + "\t");
            node = node.next;
        }
        System.out.println();
    }
    /* 链表 end */
}

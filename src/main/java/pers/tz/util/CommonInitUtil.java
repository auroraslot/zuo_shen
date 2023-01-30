package pers.tz.util;

import pers.tz.common.DoubleNode;
import pers.tz.common.Node;

import java.util.Random;

/**
 * <p>公共造数方法</p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class CommonInitUtil {

    /* 数组 start */
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
    /* 数组 end */



    /* 链表 start */
    public static Node generateRandomLinkedList(int len, int value) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        Node head = new Node((int) (Math.random() * (value + 1)));
        Node pre = head;
        while (size != 0) {
            Node cur = new Node((int) (Math.random() * (value + 1)));
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }

    public static DoubleNode generateRandomDoubleList(int len, int value) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        DoubleNode head = new DoubleNode((int) (Math.random() * (value + 1)));
        DoubleNode pre = head;
        while (size != 0) {
            DoubleNode cur = new DoubleNode((int) (Math.random() * (value + 1)));
            pre.next = cur;
            cur.last = pre;
            pre = cur;
            size--;
        }
        return head;
    }
    /* 链表 end */
}

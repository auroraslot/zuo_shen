package pers.tz.repetition01.class01;

import pers.tz.util.CommonInitUtil;
import pers.tz.util.CommonPrintUtil;

/**
 * <h3>title：找出大于num的最左位置</h3>
 * <h3>特点：</h3>
 * <span></span>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p></p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class05_BinarySearchNearLeft {

    /**
     * 找出数组中大于num的最左位置
     *
     * @param arr
     * @param num
     * @return
     */
    public static int nearestIndex(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int L = 0;
        int R = arr.length - 1;
        int mid;
        int index = -1;

        while (L <= R) {
            mid = L + ((R - L) >> 1);

            if (arr[mid] >= num) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = CommonInitUtil.initArray(true);
        CommonPrintUtil.printAll(array);

        System.out.println(nearestIndex(array, 5));
    }
}

package pers.tz.repetition01.class01;

import pers.tz.util.CommonInitUtil;
import pers.tz.util.CommonPrintUtil;

/**
 * <h3>title：二分查找目标数字是否存在</h3>
 * <h3>特点：</h3>
 * <p>O(logN)，对于这道题的场景 需要有序数组，每次二分，比较大小，进行查找</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>有序数组二分</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class04_BinarySearch {

    /**
     * 二分查找是否存在
     *
     * @param sortArray 有序数组
     * @param num 目标值
     * @return
     */
    public static boolean exists(int[] sortArray, int num) {
        if (sortArray == null || sortArray.length == 0) {
            return false;
        }

        int L = 0;
        int R = sortArray.length - 1;
        int mid;

        // 至少有两个数的时候，就进行二分
        while (L < R) {
            // 可能溢出，比如：19亿 + 20亿 / 2
            // mid = L + R / 2;

            mid = L + ((R - L) >> 1);
            if (sortArray[mid] == num) {
                return true;
            } else if (sortArray[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        // mid一直没找到，只剩下最后一个数
        return sortArray[L] == num;
    }

    public static void main(String[] args) {
        int[] array = CommonInitUtil.initArray(true);
        CommonPrintUtil.printArray(array);

        System.out.println(exists(array, 5));
    }

}

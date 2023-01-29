package pers.tz.repetition01.class01;

/**
 * <h3>title：找到局部最小数的位置</h3>
 * <h3>特点：</h3>
 * <p>数组相邻数必不相等</p>
 * <p>局部最小数定义：一个数必相邻两个数都小</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>先看最左、最右是否满足</p>
 * <p>如果都不满足，中间必有极值（导数趋势变化，中间必有极值）</p>
 * <p>劈成两半，mid是否满足，如果不满足，必有一边极值</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class06_BinarySearchAwesome {

    /**
     * 局部最小数，找到一个即可
     * @param arr
     * @return
     */
    public static int getLessIndex(int[] arr) {
        int index = -1;
        if (arr == null || arr.length == 0) {
            return index;
        }

        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }

        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int L = 1;
        int R = arr.length - 2;
        int mid;

        // 寻找波谷
        while (L < R) {
            mid = L + ((R - L) >> 1);

            if (arr[mid] > arr[mid - 1]) {
                R = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                L = mid + 1;
            } else {
                return mid;
            }
        }

        // 必然存在波谷
        return L;
    }

}

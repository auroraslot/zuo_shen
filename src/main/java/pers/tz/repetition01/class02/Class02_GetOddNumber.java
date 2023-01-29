package pers.tz.repetition01.class02;

/**
 * <h3>title：数组中有一个数出现了奇数次，其他都出现了偶数次，找出这个数</h3>
 * <h3>特点：</h3>
 * <p></p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>异或</p>
 * <p>n ^ n = 0</p>
 * <p>0 ^ n = n</p>
 * <p>...</p>
 * <p></p>
 *
 * <h3>title：</h3>
 * <h3>特点：</h3>
 * <p></p>
 * <h3 style='margin-top: 10px;'>要求：</h3>
 * <p></p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p></p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class02_GetOddNumber {

    public static int getOddNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 2, 3, 4, 4 ,5, 5};
        System.out.println(getOddNumber(arr));
    }

}

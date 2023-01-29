package pers.tz.repetition01.class02;

/**
 * <h3>title：数组中有两个数出现了奇数次，其他数都是偶数次，找到这两个数</h3>
 * <h3 style='margin-top: 10px;'>条件：</h3>
 * <p>两个奇数必不相等</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>所有数全都异或一轮，最后得到的结果就是两个奇数的异或</p>
 * <p>两个奇数异或结果必不为0</p>
 * <p>找到他们异或结果最右侧的1</p>
 * <p>根据最右侧是否是1，可以将数组分成2类</p>
 * <p>两个奇数必分散在这两类中</p>
 * <p>由此可以得到两个奇数</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class04_GetOddNumberTwo {

    public static void getOddNumberTwo(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        // 最右侧的1, example:
        // xor   = 001101111011000
        // right = 000000000001000
        int right = xor & -xor;

        int oneOddNumber = 0;
        for (int num : arr) {
            if ((num & right) == 0) {
                oneOddNumber ^= num;
            }
        }

        // xor = onw ^ two
        // two = xor ^ onw
        System.out.println("onwOddNumber: " + oneOddNumber + "twoOddNumber: " + (xor ^ oneOddNumber));
    }
}

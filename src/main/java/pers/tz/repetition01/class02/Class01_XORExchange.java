package pers.tz.repetition01.class02;

/**
 * <h3>title：不使用额外变量交换两个数的位置</h3>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>异或 = 不进位相加</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-29
 */
public class Class01_XORExchange {

    public static void swap(int a, int b) {
        System.out.println(a + " - " + b);
        a = a ^ b;
        b = a ^ b; // b = a ^ b ^ b
        a = a ^ b; // a = a ^ a ^ b
        System.out.println(a + " - " + b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a, b);
    }

}

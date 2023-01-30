package pers.tz.repetition01.class03;

import pers.tz.common.Node;

/**
 * <h3>title：两个链表相加</h3>
 * <p><a href="https://leetcode.cn/problems/add-two-numbers/">https://leetcode.cn/problems/add-two-numbers/</a></p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>对于这种题目，先找到长链表和短链表（链表长度）</p>
 * <p>短链表先加，然后再加长链表</p>
 * <p>加的同时移动指针</p>
 * <p>记录进位信息</p>
 * <p>记录last节点，根据进位信息最后生成进位节点</p>
 * <p>用 % 和 / 分别得到个位信息，和进位信息</p>
 * <p>最后把和覆盖到长链表</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class06_AddTwoNumbers {

    public static Node addTwoNumbers(Node head1, Node head2) {
        int len1 = linkedLength(head1);
        int len2 = linkedLength(head2);

        Node l = len1 > len2 ? head1 : head2; // 长链表头结点
        Node s = l == head1 ? head2 : head1; // 短链表头结点

        // 辅助指针
        Node curL = l;
        Node curS = s;

        // last指针
        Node last = curL;

        // 进位信息
        int carry = 0;
        // 和
        int curNum = 0;

        // 短链表先加
        while (curS != null) {
            curNum = curL.value + curS.value + carry;
            curL.value = curNum % 10;
            carry = curNum / 10;

            curS = curS.next;
            curL = curL.next;
            last = curL;
        }

        // 再加长链表
        while (curL != null) {
            curNum = curL.value + carry;
            curL.value = curNum % 10;
            carry = curNum / 10;

            curL = curL.next;
            last = curL;
        }

        // 是否生成进位节点
        if (carry != 0) {
            last.next = new Node(1);
        }

        return l;
    }

    private static int linkedLength(Node head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }

}

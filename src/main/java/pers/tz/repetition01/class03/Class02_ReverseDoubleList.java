package pers.tz.repetition01.class03;

import pers.tz.common.DoubleNode;
import pers.tz.util.CommonInitUtil;
import pers.tz.util.CommonPrintUtil;

/**
 * <h3>title：双链表反转，并返回头结点</h3>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>和单链表反转一样，但是要维护两个指针</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class02_ReverseDoubleList {

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        // 上一个节点
        DoubleNode pre = null;
        DoubleNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;

            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        DoubleNode head = CommonInitUtil.generateRandomDoubleList(10, 100);
        CommonPrintUtil.printLinked(head);

        head = reverseDoubleList(head);

        CommonPrintUtil.printLinked(head);
    }

}

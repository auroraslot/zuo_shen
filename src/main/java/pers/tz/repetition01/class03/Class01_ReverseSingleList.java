package pers.tz.repetition01.class03;

import pers.tz.common.Node;
import pers.tz.util.CommonInitUtil;
import pers.tz.util.CommonPrintUtil;

/**
 * <h3>title：单链表反转，并返回头结点</h3>
 * <h3 style='margin-top: 10px;'>要求：</h3>
 * <p>不使用数组空间</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>拆分问题为两个节点的反转</p>
 * <p>记录下一个节点的位置</p>
 * <p>记录上一个节点的位置</p>
 * <p></p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class01_ReverseSingleList {

    public static Node reverseSingleList(Node head) {
        // 记录上一个节点
        Node pre = null;
        // 记录下一个节点
        Node next = null;

        while (head != null) {
            // 记录下一个
            next = head.next;

            // 逆转指针
            head.next = pre;

            // 移动指针
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        Node node = CommonInitUtil.generateRandomLinkedList(10, 100);
        CommonPrintUtil.printLinked(node);

        node = reverseSingleList(node);

        CommonPrintUtil.printLinked(node);
    }

}

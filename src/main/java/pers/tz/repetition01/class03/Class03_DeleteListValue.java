package pers.tz.repetition01.class03;

import pers.tz.common.Node;
import pers.tz.util.CommonInitUtil;
import pers.tz.util.CommonPrintUtil;

/**
 * <h3>title：链表删除所有 指定值的节点</h3>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>必须要返回头结点，因为存在可能删除头结点的场景</p>
 * <p>要删2，如果开头都是2，那就要找第一个不要删的节点，把它作为起始头结点</p>
 * <p>以上的边界条件处理完后，后续就是正常流程</p>
 * <p>遍历找到满足条件的节点，修改引用</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class03_DeleteListValue {

    // head = removeValue(head, 2);
    public static Node removeValue(Node head, int num) {
        // head来到第一个不需要删的位置
        while (head != null) {
            if (head.value != num) {
                break;
            }
            head = head.next;
        }

        // 跳出来之后，两种情况
        // 1 ) head == null
        // 2 ) head != null

        // 两个指针，正常流程
        Node pre = head;
        Node cur = head;
        while (cur != null) {
            if (cur.value == num) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node node = CommonInitUtil.generateRandomLinkedList(20, 10);
        CommonPrintUtil.printLinked(node);

        node = removeValue(node, 5);

        CommonPrintUtil.printLinked(node);
    }

}

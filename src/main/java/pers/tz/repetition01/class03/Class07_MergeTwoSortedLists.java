package pers.tz.repetition01.class03;

import pers.tz.common.Node;

/**
 * <h3>title：合并两个有序链表</h3>
 * <p><a href="https://leetcode.cn/problems/merge-two-sorted-lists">https://leetcode.cn/problems/merge-two-sorted-lists</a></p>
 * <h3 style='margin-top: 10px;'>特点：</h3>
 * <p>链表是有序的</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>先找出大头，固定不变的</p>
 * <p>大头的下一个节点，和小头，以这两个开始合并</p>
 * <p>依然需要辅助指针</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class07_MergeTwoSortedLists {

    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        Node head = list1.value <= list2.value ? list1 : list2;

        Node cur1 = head.next;
        Node cur2 = head == list1 ? list2 : list1;

        Node pre = head;

        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;
            }

            pre = pre.next;
        }

        pre.next = cur1 == null ? cur2 : cur1;
        return head;
    }

}

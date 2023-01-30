package pers.tz.repetition01.class03;

import pers.tz.common.Node;

/**
 * <h3>title：链表实现栈</h3>
 * <h3 style='margin-top: 10px;'>要求：</h3>
 * <p>push、pop</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>维护头节点、size</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class04_ListImplementStack {

    public static class MyStack {
        private Node head;
        private int size;

        public void push(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
            size++;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int num = head.value;
            head = head.next;
            size--;
            return num;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

    }

}

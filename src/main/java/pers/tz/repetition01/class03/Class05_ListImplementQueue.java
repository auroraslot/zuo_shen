package pers.tz.repetition01.class03;

import pers.tz.common.Node;

/**
 * <h3>title：链表实现队列</h3>
 * <h3 style='margin-top: 10px;'>要求：</h3>
 * <p>offer、pop、peek</p>
 * <h3 style='margin-top: 10px;'>思路：</h3>
 * <p>维护头尾节点、size</p>
 * <p>...</p>
 * <p></p>
 *
 * @author irony
 * @date 2023-01-30
 */
public class Class05_ListImplementQueue {

    public static class MyQueue {
        private Node tail;
        private Node head;
        private int size;

        public void offer(int value) {
            Node node = new Node(value);
            if (this.tail == null) {
                tail = node;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int num = head.next.value;
            head = head.next;
            size--;
            return num;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.next.value;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

}

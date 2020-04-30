package com.算法.leetcode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */

public class _移除链表元素 {

    public static ListNode removeElements(ListNode head, int val) {
        //查看当前节点是否val  如果是 就获取下一个节点
        //把第一个位val 去掉
        if (head == null) {
            return null;
        }
        while (head!=null&&head.val == val) {
            head = head.next;
        }
        //第一个不是val的了
        ListNode pre=head;
        //ListNode next=delete.next;

        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode m = new ListNode(1);
       /* m.next = new ListNode(2);
        m.next.next = new ListNode(6);
        m.next.next.next = new ListNode(3);
        m.next.next.next.next = new ListNode(4);
        m.next.next.next.next.next = new ListNode(5);
        m.next.next.next.next.next.next = new ListNode(6);*/

        removeElements2(m, 6);
        print(m);

    }

    public static void print(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }



    public static ListNode removeElements2(ListNode head, int val) {
        //查看当前节点是否val  如果是 就获取下一个节点
        //把第一个位val 去掉
        if (head == null) {
            return null;
        }
        while (head!=null&&head.val == val) {
            head = head.next;
        }
        //第一个不是val的了
        ListNode pre=head;
        //ListNode next=delete.next;

        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }

}

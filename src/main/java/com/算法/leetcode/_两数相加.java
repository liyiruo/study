package com.算法.leetcode;

import com.sun.tools.doclets.internal.toolkit.util.links.LinkInfo;

import java.util.LinkedList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)  个十百
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class _两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        //把节点容器里的数据数据取出 放入链表里。个十百
        while (l1 != null) {
            list1.addLast(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.addLast(l2.val);
            l2 = l2.next;
        }

        //将两个链表里的数据取出相加，放入链表里 个十百

        int temp = 0;
        int a = 0;
        int b = 0;
        int val;
        LinkedList list3 = new LinkedList();
        while (true) {

            if (list1.isEmpty() && list2.isEmpty()&&temp==0) {
                break;
            }

            if (list1.isEmpty()) {
                a = 0;
            } else {
                a = (int) list1.getFirst();
                list1.remove();
            }

            if (list2.isEmpty()) {
                b = 0;
            } else {
                b = (int) list2.getFirst();
                list2.remove();
            }

            //判断 a+b的值
            val = a + b + temp;
            temp=0;
            if (val > 9) {
                temp = 1;
                val = val - 10;
            }
            list3.addLast(val);

            System.out.println("list3==>" + list3);
        }
        //将链表里的数据取出 放入节点里
        ListNode l3=null;
        int mval = 0;
        while (!list3.isEmpty()) {
            mval = (int) list3.removeLast();
            ListNode l = new ListNode(mval);
            l.next=l3;
            l3=l;
        }
        return l3;
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        ListNode n = new ListNode(5);
//        n.next = new ListNode(4);
//        n.next.next = new ListNode(3);

//342+465=807 ==》2 2 8
        ListNode m = new ListNode(5);
//        m.next = new ListNode(6);
//        m.next.next = new ListNode(4);


        _两数相加 o = new _两数相加();
        ListNode x = o.addTwoNumbers(m, n);

        //9--8--4
        while (x != null) {
            int a = x.val;
            linkedList.addLast(a);
            x = x.next;
        }
        System.out.println("linkedList==>" + linkedList);
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}




// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}



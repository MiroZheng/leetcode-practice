package com.leetcode.practice;

/**
 * @author: Miro
 * @date: 2021/2/28 21:23
 * @description:
 */
public class Test02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建一个链表存放结果
        ListNode result = new ListNode(0);
        ListNode cur = result;
        // 变量存放两数之和的进位
        int sum =0;
        while (l1 != null || l2 != null || sum != 0){
            if(l1 != null){
                sum +=l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum+=l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(sum % 10);
            cur =cur.next;
            sum = sum / 10;
        }
        return result.next;
    }

    //创建一个单向链表，实际leetcode 忽略下面部分
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

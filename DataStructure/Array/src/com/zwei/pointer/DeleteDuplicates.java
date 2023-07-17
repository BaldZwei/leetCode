package com.zwei.pointer;

/**
 * @ClassName DeleteDuplicates
 * @Author awei
 * @Data 2023/7/17 15:41：
 **/
public class DeleteDuplicates {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(fast.val != slow.val){
                slow.next=fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next =null;
        return head;
    }
}


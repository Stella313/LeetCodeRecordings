public class No_0019 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count ++;
            cur = cur.next;
        }
        if(n > count){
            return head;
        }
        int index = count - n;
        cur = head;
        ListNode pre = cur;
        if(index == 0){
            head = head.next;
            return head;
        }
        cur = cur.next;
        int find = 1;
        while(cur != null){
            if(find == index){
                ListNode next = cur.next;
                System.out.println(cur.val);
                System.out.println(next == null);
                pre.next = next;
                cur.next = null;
                return head;
            }else{
                find ++;
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}

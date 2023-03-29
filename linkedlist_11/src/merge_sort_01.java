public class merge_sort_01 {
    public class ListNode {
    int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode head = new ListNode();
        while(temp1!=null && temp2!=null){
            if(temp1.val==temp2.val){
                insertLast(temp1.val,head);
                temp1=temp1.next;
            }
            else if(temp1.val>temp2.val){
                insertLast(temp2.val,head);
                temp2=temp2.next;
            }
            else if(temp1.val<temp2.val){
                insertLast(temp1.val,head);
                temp1=temp1.next;
            }
        }

        if(temp1==null){
            while(temp2!=null){
                insertLast(temp2.val,head);
                temp2=temp2.next;
            }
        }
        else if (temp2==null){
            while(temp1!=null){
                insertLast(temp1.val,head);
                temp1=temp1.next;
            }
        }

        return head;
    }





    void insertLast(int val,ListNode head){
        ListNode node = new ListNode(val);
        if(head==null){
            head=node;
            node.next=null;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        return;
    }
    public static void main(String[] args) {
    }
}

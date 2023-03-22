public class DLL {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
//        if(head ==null){
//            head =node;
//            return;
//        }
//        head.prev=node;
//        node.next=head;
//        node.prev=null;
//        head=node;
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
//        if(head==null){
//            insertFirst(value);
//            return;
//        }
        Node node = new Node(value);
        Node last=head;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next = node;
        node.prev=last;
    }


    public void insert(int after,int value){
        Node p= find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        DLL.Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


    class Node{
        int value;
       private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node (int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}

public class LinkedList {
    static class LinkedListNode {
        int data;
        LinkedListNode next;
       LinkedListNode(int d) {
            this.data = d;
            this.next=null;

        }
    }
    LinkedListNode head;
        public LinkedListNode create(int[] a) {
            if(head==null) {
                head = new LinkedListNode(a[0]);
                LinkedListNode curr = head;
                for (int i = 1; i < a.length; i++) {
                    LinkedListNode n = new LinkedListNode(a[i]);
                    curr.next = n;
                    curr = n;
                }
            }
            return head;
        }
        public void append(LinkedListNode h, int item)
        {
            LinkedListNode curr=h;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            LinkedListNode n=new LinkedListNode(item);
            curr.next=n;
            curr=n;

        }
        public void insertAt(LinkedListNode h, int index, int item) {
            LinkedListNode curr = h;
            int i=0;
            LinkedListNode node=new LinkedListNode(item);
            while (curr.next != null)
            {
                i++;
                curr=curr.next;
                if(i==index-1) //index starts from 0
                    break;
        }
            LinkedListNode currnext=curr.next;
            curr.next=node;
            node.next=currnext;
        }

        public  void middleElement(LinkedListNode head)
        {
            LinkedListNode fptr=head,sptr=head;  //Fast pointer and slow pointer
            while(fptr!=null && fptr.next!=null)
            {
                sptr=sptr.next;
                fptr=fptr.next.next;
            }
            assert sptr != null;
            System.out.print(sptr.data);
        }
        public int length(LinkedListNode h)
        {
            int l=0;
            while (h!=null) {
                l++;
                h=h.next;
            }
            return l;
        }
    public  void display(LinkedListNode head) {
        while (head!= null) {
            System.out.print(head.data+"  ");
            head=head.next;
        }
    }
        public static void main(String[] args)
        {
            int[] a =new int[]{20,40,60,80,100};
            LinkedList l=new LinkedList();
            LinkedListNode h=l.create(a);
            l.display(h);
        }
    }

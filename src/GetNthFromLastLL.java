public class GetNthFromLastLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int getNthFromLastLL(Node head, int n){
        if(head == null){
            return -1;
        }
        int size = 0;
        Node current = head;
        while( current != null){
            size++;
            current = current.next;
        }
        if(size<n){
            return -1;
        }
        int count = size - n;
        while(count >0){
            count --;
            head = head.next;
        }return head.data;
    }




    public static void main(String[] args) {

    }
}

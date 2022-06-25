public class GetNthFromLastLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //take inputs of head and n
    public static int getNthFromLastLL(Node head, int n){
        //if list is empty return -1
        if(head == null){
            return -1;
        }
        int size = 0;
        Node current = head;
        //else until the current becomes null get the size of the list
        while( current != null){
            size++;
            current = current.next;
        }
        //if input is more than the size then just return -1
        if(size<n){
            return -1;
        }
        //get another int count , which is the count of the node form start to be removed,
        //ex size 8, n= 2, count = size -n =6 th node
        int count = size - n;
        //until count becomes 0 run a loop and traverse the head
        while(count >0){
            count --;
            head = head.next;
        }
        //wherever head reaches by then, return the data of the head
        return head.data;
    }




    public static void main(String[] args) {

    }
}

/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head.data == key) return true;
        Node curr = head;
        do{
            
            if(curr.data == key) return true;
            curr = curr.next;
        }while(curr!=null);
        return false;
    }
}
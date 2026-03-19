class Node{int data;Node next;Node(int x){data=x;next=null;}}
public class ReverseList{
 public Node reverseList(Node head){
  Node prev=null,cur=head;
  while(cur!=null){
   Node nxt=cur.next;
   cur.next=prev;
   prev=cur;
   cur=nxt;
  }
  return prev;
 }
}
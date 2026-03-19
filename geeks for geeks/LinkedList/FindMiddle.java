class Node{int data;Node next;Node(int x){data=x;next=null;}}
public class FindMiddle{
 int getMiddle(Node head){
  if(head==null)return -1;
  Node s=head,f=head;
  while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}
  return s.data;
 }
}
class Node{int data;Node next;Node(int x){data=x;next=null;}}
public class CheckCircular{
 boolean isCircular(Node head){
  Node s=head,f=head;
  while(f!=null&&f.next!=null){
   s=s.next;f=f.next.next;
   if(s==f)return true;
  }
  return false;
 }
}
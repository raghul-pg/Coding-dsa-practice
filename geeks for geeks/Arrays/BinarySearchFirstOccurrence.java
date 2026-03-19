public class BinarySearchFirstOccurrence{
 public int search(int[] a,int k){
  int l=0,h=a.length-1,res=-1;
  while(l<=h){
   int m=l+(h-l)/2;
   if(a[m]==k){res=m;h=m-1;}
   else if(a[m]<k)l=m+1;
   else h=m-1;
  }
  return res;
 }
}
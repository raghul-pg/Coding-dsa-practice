import java.util.Arrays;
public class TwoSum{
 boolean twoSum(int[] a,int t){
  Arrays.sort(a);
  int l=0,r=a.length-1;
  while(l<r){
   int s=a[l]+a[r];
   if(s==t)return true;
   else if(s<t)l++;
   else r--;
  }
  return false;
 }
}
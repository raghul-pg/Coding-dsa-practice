import java.util.Arrays;
public class MajorityElement{
 int majority(int[] a){
  Arrays.sort(a);
  int c=a[a.length/2],cnt=0;
  for(int x:a)if(x==c)cnt++;
  return cnt>a.length/2?c:-1;
 }
}
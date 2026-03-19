public class RotateArray{
 static void rotate(int[] a,int d){
  int n=a.length;d%=n;
  rev(a,0,d-1);rev(a,d,n-1);rev(a,0,n-1);
 }
 static void rev(int[] a,int l,int r){
  while(l<r){
   int t=a[l];a[l]=a[r];a[r]=t;l++;r--;
  }
 }
}
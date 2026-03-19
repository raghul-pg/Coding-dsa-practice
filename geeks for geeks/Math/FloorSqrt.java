public class FloorSqrt{
 int sqrt(int n){
  if(n<=1)return n;
  int i=1;
  while(i*i<=n)i++;
  return i-1;
 }
}
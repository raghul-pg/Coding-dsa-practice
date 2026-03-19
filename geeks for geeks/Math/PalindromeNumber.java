public class PalindromeNumber{
 boolean isPal(int n){
  int o=n,r=0;
  while(n>0){r=r*10+n%10;n/=10;}
  return o==r;
 }
}
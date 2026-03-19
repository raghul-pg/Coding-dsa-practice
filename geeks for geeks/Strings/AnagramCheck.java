import java.util.Arrays;
public class AnagramCheck{
 public static boolean check(String s1,String s2){
  if(s1.length()!=s2.length())return false;
  char[] a=s1.toCharArray(),b=s2.toCharArray();
  Arrays.sort(a);Arrays.sort(b);
  return Arrays.equals(a,b);
 }
}
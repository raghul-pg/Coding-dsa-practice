public class LongestUniqueSubstring{
 public int length(String s){
  int[] f=new int[26];int l=0,max=0;
  for(int r=0;r<s.length();r++){
   char c=s.charAt(r);f[c-'a']++;
   while(f[c-'a']>1){f[s.charAt(l)-'a']--;l++;}
   max=Math.max(max,r-l+1);
  }
  return max;
 }
}
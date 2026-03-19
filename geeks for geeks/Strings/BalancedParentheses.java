import java.util.Stack;
public class BalancedParentheses{
 public boolean isBalanced(String s){
  Stack<Character> st=new Stack<>();
  for(char c:s.toCharArray()){
   if(c=='('||c=='{'||c=='[')st.push(c);
   else{
    if(st.isEmpty())return false;
    char t=st.pop();
    if(c==')'&&t!='('||c=='}'&&t!='{'||c==']'&&t!='[')return false;
   }
  }
  return st.isEmpty();
 }
}
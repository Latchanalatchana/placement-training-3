import java.util.*;

class Solution {
    static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();

        for(char c : x.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else{
                if(st.isEmpty()) return false;

                char top = st.pop();
                if((c==')' && top!='(') ||
                   (c=='}' && top!='{') ||
                   (c==']' && top!='['))
                    return false;
            }
        }
        return st.isEmpty();
    }
}

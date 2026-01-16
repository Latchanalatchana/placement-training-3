import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.next();
            Stack<Character> st = new Stack<>();

            boolean balanced = true;

            for(char c : s.toCharArray()){
                if(c=='(' || c=='{' || c=='[')
                    st.push(c);
                else{
                    if(st.isEmpty()){
                        balanced = false;
                        break;
                    }
                    char top = st.pop();
                    if((c==')' && top!='(') ||
                       (c=='}' && top!='{') ||
                       (c==']' && top!='[')){
                        balanced = false;
                        break;
                    }
                }
            }

            if(!st.isEmpty()) balanced = false;

            System.out.println(balanced);
        }
    }
}

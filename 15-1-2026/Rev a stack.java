import java.util.*;

class Solution {

    static void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;

        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }
}

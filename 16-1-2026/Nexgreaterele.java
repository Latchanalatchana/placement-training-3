import java.util.*;

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] res = new long[n];
        Stack<Long> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }
}

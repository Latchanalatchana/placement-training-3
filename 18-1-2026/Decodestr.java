import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(curr);
                curr = "";
                num = 0;
            } else if (c == ']') {
                int times = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder sb = new StringBuilder(prev);
                for (int i = 0; i < times; i++) sb.append(curr);

                curr = sb.toString();
            } else {
                curr += c;
            }
        }
        return curr;
    }
}

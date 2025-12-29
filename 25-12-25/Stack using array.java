class Stack {
    int top = -1;
    int[] st = new int[5];

    void push(int x) {
        st[++top] = x;
    }

    int pop() {
        return st[top--];
    }
}

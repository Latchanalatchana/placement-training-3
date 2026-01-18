import java.util.*;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);

        System.out.println(minHeap.poll()); // 2
        System.out.println(minHeap.poll()); // 5
    }
}

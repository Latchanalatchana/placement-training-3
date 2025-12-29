class Parity {
    static int parity(int[] bits) {
        int count = 0;
        for (int b : bits)
            if (b == 1) count++;
        return count % 2;
    }
}

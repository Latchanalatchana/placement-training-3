class Stats {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int n = arr.length;

        double sum = 0;
        for (int x : arr) sum += x;
        double mean = sum / n;

        double var = 0;
        for (int x : arr)
            var += (x - mean) * (x - mean);
        var /= n;

        double std = Math.sqrt(var);

        System.out.println(mean);
        System.out.println(var);
        System.out.println(std);
    }
          }
                           

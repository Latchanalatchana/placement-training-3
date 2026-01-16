class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> res = new ArrayList<>();

        int start = 0, currSum = 0;

        for(int end = 0; end < n; end++){
            currSum += arr[end];

            while(currSum > s && start <= end){
                currSum -= arr[start++];
            }

            if(currSum == s){
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}


class MaxElementIndex {

    int findMaxIndex(int[] nums) {
        int maxIdx = 0, itr = 0, n = nums.length, max = Integer.MIN_VALUE;
        while(itr < n) {
            if(max < nums[itr]) {
                max = nums[itr];
                maxIdx = itr;
            }
            itr++;
        }
        return maxIdx;
    }

}
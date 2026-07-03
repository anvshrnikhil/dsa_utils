
class BinarySearch {


    /**
     * returns index of the element and all elements are unique
     */
    int binarySearch(List<Integer> nums, int value) {
        int low = 0, high = nums.size() - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            int midValue = nums.get(mid);
            if(midValue == value) return mid;
            if(midValue > value)
                high = mid - 1;
            else 
                low = mid + 1;
        }
        return -1;
    }

}
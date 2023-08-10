class Solution {
    public boolean search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            return true;
        }

        // Check if left half is sorted
        if (nums[left] < nums[mid]) {
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        // Check if right half is sorted
        else if (nums[left] > nums[mid]) {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } 
        // Handle duplicates
        else {
            left++;
        }
    }
    return false;
}

}
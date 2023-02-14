//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
//Brute Force Approach

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length , begin = -1, end = -2, min = nums[n-1], max = nums[0];
        for(int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-i-1]);
            if(nums[i] < max) end = i;
            if(nums[n-i-1] > min) begin = n-i-1;
        }
        return end - begin +1;
    }
}

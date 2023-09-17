class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        int min = 0;
        
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && nums.get(min) > nums.get(i))   min = i;
        }
        
        for(int i = 0; i < nums.size(); i++)    ans[(i + nums.size() - min) % nums.size()] = nums.get(i);
        
        for(int i = 0; i < ans.length - 1; i++)    if(ans[i] > ans[i + 1]) return -1;
        
        return min == 0 ? min : nums.size() - min;
    }
}
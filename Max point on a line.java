//https://leetcode.com/problems/max-points-on-a-line/description/
//Brute force Approach

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n <= 2) return n;
        int res = 2;
        for(int i =0;i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = 2;
                for(int k = 0; k < n; k++){
                    if(k != i && k != j){
                         int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                         int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                         if(x==y) temp++;
                    }
                }
                if(temp > res){
                    res = temp;
                }
            }
        }
        return res;
    }
}
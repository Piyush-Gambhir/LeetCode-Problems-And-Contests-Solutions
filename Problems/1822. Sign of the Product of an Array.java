/*
Problem Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
*/

class Solution {

    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                negativeCount++;
            }
        }
        return negativeCount % 2 == 0 ? 1 : -1;

    }
}
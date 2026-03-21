class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length && j <= i + k; j++) {
                if (Math.abs(i - j) <= k && i != j && nums[i] == nums[j]) {
                    System.out.println(i - j);
                    return true;
                }
            }
        }
        return false;
    }
}
public class Solution {

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                candidate = nums[i];
                votes = 1;
            } else if (nums[i] == candidate) {
                votes++;
            } else {
                votes--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + majorityElement(nums));
    }
}
import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = sol.removeElement(nums1, val1);
        System.out.println("k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = sol.removeElement(nums2, val2);
        System.out.println("k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));
    }
}
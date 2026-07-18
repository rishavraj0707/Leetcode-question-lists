public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int l = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[l]) {
                l++;
                nums[l] = nums[i];
            }
        }
        return l + 1;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int len1 = sol.removeDuplicates(nums1);
        System.out.println("Length: " + len1);
        for (int i = 0; i < len1; i++) System.out.print(nums1[i] + " ");
        System.out.println();
        
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = sol.removeDuplicates(nums2);
        System.out.println("Length: " + len2);
        for (int i = 0; i < len2; i++) System.out.print(nums2[i] + " ");
        System.out.println();
        
        int[] nums3 = {};
        int len3 = sol.removeDuplicates(nums3);
        System.out.println("Length: " + len3);
    }
}
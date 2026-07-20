class Main {
    public int singleNumber(int[] nums) {
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            value ^= nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        Main sol = new Main();

        // Example 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Output: " + sol.singleNumber(nums1));

        // Example 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output: " + sol.singleNumber(nums2));

        // Example 3
        int[] nums3 = {1};
        System.out.println("Output: " + sol.singleNumber(nums3));
    }
}
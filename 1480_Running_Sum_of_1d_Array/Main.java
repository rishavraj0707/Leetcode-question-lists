import java.util.Arrays;

class Main {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main sol = new Main();

        // Example 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Output: " + Arrays.toString(sol.runningSum(nums1)));

        // Example 2
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Output: " + Arrays.toString(sol.runningSum(nums2)));

        // Example 3
        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println("Output: " + Arrays.toString(sol.runningSum(nums3)));
    }
}
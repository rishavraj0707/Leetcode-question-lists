class solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i : nums)
            totalSum += i;

        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalSum - leftsum - nums[i];
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = sol.pivotIndex(nums);
        System.out.println(result);
    }
}
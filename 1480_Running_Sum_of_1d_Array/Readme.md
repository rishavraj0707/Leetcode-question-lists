# Running Sum of 1D Array (Java)

## Problem Statement

Given an array `nums`, return the running sum of `nums`.

The **running sum** of an array is defined as:

`runningSum[i] = nums[0] + nums[1] + ... + nums[i]`

---

## Example 1

**Input:**
```text
nums = [1, 2, 3, 4]
```

**Output:**
```text
[1, 3, 6, 10]
```

**Explanation:**
- 1
- 1 + 2 = 3
- 1 + 2 + 3 = 6
- 1 + 2 + 3 + 4 = 10

---

## Example 2

**Input:**
```text
nums = [1, 1, 1, 1, 1]
```

**Output:**
```text
[1, 2, 3, 4, 5]
```

---

## Example 3

**Input:**
```text
nums = [3, 1, 2, 10, 1]
```

**Output:**
```text
[3, 4, 6, 16, 17]
```

---

## Java Code

```java
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
```

---

## Sample Output

```text
Output: [1, 3, 6, 10]
Output: [1, 2, 3, 4, 5]
Output: [3, 4, 6, 16, 17]
```

---

## Algorithm

1. Initialize `sum = 0`.
2. Create a new array `arr` of the same size as the input array.
3. Traverse the array from left to right.
4. Add the current element to `sum`.
5. Store `sum` in the corresponding index of `arr`.
6. Return the `arr`.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(n)** (for the output array)

---

## How to Run

Compile the program:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```
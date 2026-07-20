# Single Number (Java)

## Problem Statement

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

### Link 
https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array

### Example 1
**Input:**
```text
nums = [2, 2, 1]
```

**Output:**
```text
1
```

### Example 2
**Input:**
```text
nums = [4, 1, 2, 1, 2]
```

**Output:**
```text
4
```

### Example 3
**Input:**
```text
nums = [1]
```

**Output:**
```text
1
```

---

## Java Code

```java
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
```

---

## Sample Output

```text
Output: 1
Output: 4
Output: 1
```

---

## Algorithm

1. Initialize a variable `value` with the first element.
2. Traverse the array from the second element.
3. Perform XOR (`^`) between `value` and the current element.
4. Since `a ^ a = 0` and `0 ^ b = b`, all duplicate numbers cancel out.
5. The remaining value is the single number.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**

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

### Author
*Rishav Raj*

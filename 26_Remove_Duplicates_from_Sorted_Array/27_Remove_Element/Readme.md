Remove Duplicates from Sorted Array
=====================================

DESCRIPTION
-----------
This program removes duplicate values from a sorted integer array
in-place and returns the number of unique elements.

Given a sorted array `nums`, the function modifies the array so
that each unique element appears only once, in the same relative
order. The elements beyond the returned length do not matter.

FILE
----
Solution.java

HOW IT WORKS
------------
The solution uses the two-pointer technique:

  - `l` (slow pointer) marks the last position of a confirmed
    unique element.
  - `i` (fast pointer) scans through the array looking for the
    next value that differs from nums[l].

Steps:
  1. If the array is empty, return 0 immediately.
  2. Start `l` at index 0 (the first element is always unique).
  3. Loop `i` from index 1 to the end of the array:
       - If nums[i] is different from nums[l], it's a new unique
         value: increment `l` and copy nums[i] into nums[l].
       - If nums[i] equals nums[l], it's a duplicate: skip it.
  4. Return l + 1, the count of unique elements.

CODE
----
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
}

EXAMPLE
-------
Input:  nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

COMPLEXITY
----------
Time:  O(n)  - single pass through the array
Space: O(1)  - modifies the array in-place, no extra storage

REQUIREMENTS
------------
- Input array must already be sorted in non-decreasing order.
- Java 8 or later to compile and run.

HOW TO RUN
----------
1. Save Solution.java (with a main method for testing).
2. Compile:  javac Solution.java
3. Run:      java Solution
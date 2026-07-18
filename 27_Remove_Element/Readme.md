REMOVE ELEMENT - JAVA SOLUTION
================================

PROBLEM
-------
Given an integer array `nums` and an integer `val`, remove all occurrences
of `val` in `nums` in-place. The order of the remaining elements may be
changed. Return `k`, the number of elements in `nums` that are not equal
to `val`.

FILES
-----
Main.java   - Contains the Solution class (removeElement method) and a
              Main class with a main() method to test it.

APPROACH
--------
Two-pointer technique:
- `k` tracks the position where the next valid (non-val) element should
  be placed.
- Iterate through the array with index `i`.
- Whenever nums[i] != val, copy it to nums[k] and increment k.
- At the end, the first `k` elements of nums contain all values not
  equal to val, and k is returned as the new length.

COMPLEXITY
----------
Time:  O(n)  - single pass through the array
Space: O(1)  - modifies the array in-place, no extra data structures

HOW TO RUN
----------
1. Save the code as Main.java
2. Compile:  javac Main.java
3. Run:      java Main

EXPECTED OUTPUT
----------------
k = 2, nums = [2, 2]
k = 5, nums = [0, 1, 4, 0, 3]

NOTES
-----
- For LeetCode submissions, only the `Solution` class (without the
  public `Main` wrapper) is needed, since LeetCode provides its own
  test harness.
- Java requires the public class name to match the filename, which is
  why the test-runner class here is named `Main` instead of `Solution`.
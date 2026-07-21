# 977. Squares of a Sorted Array

## Problem
Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

**LeetCode Problem:**  
https://leetcode.com/problems/squares-of-a-sorted-array/?envType=problem-list-v2&envId=array

---

## Approach
This solution uses the **Two Pointer** technique.

- Initialize two pointers:
  - `left` at the beginning of the array.
  - `right` at the end of the array.
- Compare the absolute values of both pointers.
- Place the larger square at the end of the result array.
- Move the corresponding pointer inward.
- Continue until all elements are processed.

---

## Algorithm
1. Create a result array of the same size.
2. Set `left = 0` and `right = n - 1`.
3. Iterate from the last index of the result array to the first.
4. Compare `|nums[left]|` and `|nums[right]|`.
5. Store the larger square in the current position.
6. Move the appropriate pointer.
7. Return the result array.

---

## ⏱Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## ▶Example

**Input**

```text
[-4, -1, 0, 3, 10]
```

**Output**

```text
[0, 1, 9, 16, 100]
```

---

## 📚 Topics

- Array
- Two Pointers
- Sorting

---


## Author

*Rishav Raj*
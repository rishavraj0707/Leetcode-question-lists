# Search Insert Position — Binary Search

## Problem Statement

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

**LeetCode Link:** [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

---

## Approach

This solution uses a **binary search** approach.

1. Maintain two pointers, `lo` and `hi`, marking the search boundaries of the array.
2. Calculate the middle index `mid` and compare `nums[mid]` with `target`.
3. If `nums[mid] == target`, the value is found — return `mid`.
4. If `nums[mid] < target`, discard the left half by moving `lo = mid + 1`.
5. If `nums[mid] > target`, discard the right half by moving `hi = mid - 1`.
6. If the loop ends without finding the target, `lo` will be the correct position to insert the value, so return `lo`.

This approach takes advantage of the fact that the array is sorted, making it much faster than a linear scan.

---

## ⏱ Complexity

* **Time Complexity:** `O(log n)`
* **Space Complexity:** `O(1)`

---

## ▶ Example

### Input

```text
nums = [1, 3, 5, 6]
target = 5
```

### Output

```text
2
```

### Explanation

`nums[2] = 5`, which matches the target directly, so the answer is `2`.

### Input (Insert Case)

```text
nums = [1, 3, 5, 6]
target = 2
```

### Output

```text
1
```

### Explanation

`2` is not present in the array, but if inserted, it would go at index `1` (between `1` and `3`) to keep the array sorted.

---

## 📚 Learning Note

This binary search solution is a great way to practice the classic **divide-and-conquer** technique on sorted arrays. It's also a foundational pattern for solving many other problems like finding the first/last occurrence of an element, or searching in rotated sorted arrays.

---

### Author

*Rishav Raj*
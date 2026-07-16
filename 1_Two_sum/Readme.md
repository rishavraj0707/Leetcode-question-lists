# Two Sum — Brute Force (Nested Loop)

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Approach

This solution uses a **nested loop (brute-force)** approach.

1. Traverse the array using the first loop.
2. For each element, check all remaining elements using the second loop.
3. If `nums[i] + nums[j] == target`, return the indices `[i, j]`.

This approach is simple and easy to understand, making it a good starting point for beginners.

---

## ⏱ Complexity

* **Time Complexity:** `O(n²)`
* **Space Complexity:** `O(1)`

---

## ▶ Example

### Input

```text
nums = [2, 7, 11, 15]
target = 9
```

### Output

```text
[0, 1]
```

### Explanation

`nums[0] + nums[1] = 2 + 7 = 9`, so the answer is `[0, 1]`.

---

## 📚 Learning Note

This brute-force solution is useful for understanding the problem and practicing **nested loops**. An optimized solution using a **hash map (`unordered_map`)** can reduce the time complexity to **O(n)**.

---

### Author

*Rishav Raj*

# Find Pivot Index — Prefix Sum

## Problem Statement

Given an array of integers `nums`, calculate the **pivot index** of this array. The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If no such index exists, return `-1`. If there are multiple pivot indices, return the leftmost one.

**LeetCode Link:** https://leetcode.com/problems/find-pivot-index/

---

## Approach

This solution uses a **prefix sum** approach.

1. First, calculate the `totalSum` of all elements in the array.
2. Traverse the array while keeping track of `leftsum` (sum of elements before the current index).
3. For each index `i`, calculate `rightsum` as `totalSum - leftsum - nums[i]`.
4. If `leftsum == rightsum`, the current index is the pivot index — return `i`.
5. Otherwise, update `leftsum` by adding `nums[i]` and continue.
6. If no pivot index is found after the loop, return `-1`.

This approach avoids recalculating the sum for every index by maintaining a running `leftsum`, making it much more efficient than a brute-force nested loop.

---

## ⏱ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

---

## ▶ Example

### Input

```text
nums = [1, 7, 3, 6, 5, 6]
```

### Output

```text
3
```

### Explanation

At index `3`, left sum = `1 + 7 + 3 = 11` and right sum = `5 + 6 = 11`, which are equal, so the pivot index is `3`.

### Input (No Pivot Case)

```text
nums = [1, 2, 3]
```

### Output

```text
-1
```

### Explanation

No index exists where the left sum equals the right sum, so the answer is `-1`.

---

## 📚 Learning Note

This prefix sum solution is a great way to practice avoiding repeated computation by maintaining a running total. It's a foundational technique used in many array-based problems involving sums or ranges.

---

### Author

*Rishav Raj*
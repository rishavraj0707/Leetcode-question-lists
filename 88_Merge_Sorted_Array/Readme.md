# Merge Sorted Array (Java)

## Problem
Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

- `nums1` has a size of `m + n`, where the first `m` elements are valid and the last `n` elements are `0` (empty space).
- `nums2` has `n` elements.

## Link - https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

## Example

**Input:**
```java
nums1 = {1, 2, 3, 0, 0, 0}
m = 3

nums2 = {2, 5, 6}
n = 3
```

**Output:**
```text
[1, 2, 2, 3, 5, 6]
```

## Approach
- Start comparing elements from the end of both arrays.
- Place the larger element at the last available position in `nums1`.
- Continue until all elements are merged.
- If elements remain in `nums2`, copy them into `nums1`.

## Time Complexity
- **O(m + n)**

## Space Complexity
- **O(1)** (No extra space used)

## How to Run

Compile:
```bash
javac Main.java
```

Run:
```bash
java Main
```

## Output
```text
[1, 2, 2, 3, 5, 6]
```

## Author
*Rishav Raj*

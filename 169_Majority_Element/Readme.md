# Majority Element - Java

This repository contains a Java solution for the **Majority Element** problem using the **Boyer-Moore Voting Algorithm**.

## Problem Statement

Given an integer array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `⌊n / 2⌋` times.


**LeetCode Problem:**  
https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=array
---

## Algorithm

- Initialize a candidate and vote count.
- Traverse the array.
- Increase votes if the current element matches the candidate.
- Decrease votes otherwise.
- If votes become zero, select the current element as the new candidate.
- The final candidate is the majority element.

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**

## Project Structure

```
Majority-Element/
│── Solution.java
└── README.md
```

## How to Run

```bash
javac Solution.java
java Solution
```

## Example

**Input**

```text
[2,2,1,1,1,2,2]
```

**Output**

```text
2
```

## Author

*Rishav Raj*
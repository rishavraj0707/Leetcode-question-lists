# Best Time to Buy and Sell Stock (Java)

## Problem
Given an array `prices` where `prices[i]` is the price of a stock on the `i-th` day, find the maximum profit you can achieve by buying one stock and selling it later.

- You can complete **only one transaction** (buy once and sell once).
- If no profit is possible, return `0`.

## Example

**Input:**
```java
prices = {7, 1, 5, 3, 6, 4}
```

**Output:**
```text
Maximum Profit = 5
```

**Explanation:**
- Buy at price `1`
- Sell at price `6`
- Profit = `6 - 1 = 5`

## Approach
- Keep track of the minimum stock price seen so far.
- For each price:
  - Update the minimum price if the current price is lower.
  - Otherwise, calculate the profit by selling at the current price.
  - Update the maximum profit if the current profit is greater.

## Algorithm
1. Initialize:
   - `minPrice = Integer.MAX_VALUE`
   - `maxProfit = 0`
2. Traverse the array:
   - If the current price is less than `minPrice`, update `minPrice`.
   - Otherwise, update `maxProfit` with the maximum of the current profit and previous `maxProfit`.
3. Return `maxProfit`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

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
Maximum Profit = 5
```

## Author
*Rishav Raj*
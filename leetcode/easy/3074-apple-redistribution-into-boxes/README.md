# Apple Redistribution into Boxes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array `apple` of size `n` and an array `capacity` of size `m`.

There are `n` packs where the `ith` pack contains `apple[i]` apples. There are `m` boxes as well, and the `ith` box has a capacity of `capacity[i]` apples.

Return  *the  **minimum**  number of boxes you need to select to redistribute these* `n` *packs of apples into boxes*.

 **Note**  that, apples from the same pack can be distributed into different boxes.

 

 **Example 1:** 

```
Input: apple = [1,3,2], capacity = [4,3,1,5,2]
Output: 2
Explanation: We will use boxes with capacities 4 and 5.
It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.

```

 **Example 2:** 

```
Input: apple = [5,5,5], capacity = [2,4,2,7]
Output: 4
Explanation: We will need to use all the boxes.

```

 

 **Constraints:** 

- 1 <= n == apple.length <= 50
- 1 <= m == capacity.length <= 50
- 1 <= apple[i], capacity[i] <= 50
- The input is generated such that it's possible to redistribute packs of apples into boxes.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 37.20%)  
**Memory:** 43.9 MB (beats 92.13%)  
**Submitted:** 2026-10-29T13:09:56.320Z  

```java
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum = sum + apple[i];
        }
        Arrays.sort(capacity);
        int count = 0;
        int total = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            total = total + capacity[i];
            count++;
            if (total >= sum) {
                break;
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/apple-redistribution-into-boxes/)
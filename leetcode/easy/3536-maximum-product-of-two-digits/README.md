# Maximum Product of Two Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `n`.

Return the  **maximum**  product of any two digits in `n`.

 **Note:**  You may use the  **same**  digit twice if it appears more than once in `n`.

 

 **Example 1:** 

 **Input:**  n = 31

 **Output:**  3

 **Explanation:** 

- The digits of n are [3, 1].
- The possible products of any two digits are: 3 * 1 = 3.
- The maximum product is 3.

 **Example 2:** 

 **Input:**  n = 22

 **Output:**  4

 **Explanation:** 

- The digits of n are [2, 2].
- The possible products of any two digits are: 2 * 2 = 4.
- The maximum product is 4.

 **Example 3:** 

 **Input:**  n = 124

 **Output:**  8

 **Explanation:** 

- The digits of n are [1, 2, 4].
- The possible products of any two digits are: 1  *2 = 2, 1*  4 = 4, 2 * 4 = 8.
- The maximum product is 8.

 

 **Constraints:** 

- 10 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 2.32%)  
**Memory:** 43 MB (beats 9.10%)  
**Submitted:** 2026-10-15T16:09:07.018Z  

```java
class Solution {
    public int maxProduct(int n) {
        
        int[] arr = String.valueOf(n).chars()
                         .map(c -> c - '0')
                         .toArray();
            Arrays.sort(arr);
            int n1=arr.length;
            int pr= (arr[n1  -1] * arr[n1-2]);
            return pr;
                    
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-two-digits/)
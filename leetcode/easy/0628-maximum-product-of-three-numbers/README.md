# Maximum Product of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Find three numbers whose product is  **maximum**  and return the  **maximum**  product.

 

 **Example 1:** 

 **Input:**  nums = [1,2,-3]

 **Output:**  -6

 **Explanation:** 

The only three numbers are 1, 2, and -3, so the maximum product is `1  *2*  -3 = -6`.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  24

 **Explanation:** 

The largest product comes from the three greatest numbers: `2  *3*  4 = 24`.

 **Example 3:** 

 **Input:**  nums = [-1,-2,-3]

 **Output:**  -6

 **Explanation:** 

The only three numbers are -1, -2, and -3, so the maximum product is `(-1)  *(-2)*  (-3) = -6`.

 

 **Constraints:** 

- 3 <= nums.length <= 104
- -1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 32.38%)  
**Memory:** 47.7 MB (beats 70.83%)  
**Submitted:** 2026-10-14T09:28:37.259Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int max = nums[n-1]*nums[n-2]*nums[n-3];
            int max2= nums[0]*nums[1]*nums[n-1];       
            return Math.max(max,max2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)
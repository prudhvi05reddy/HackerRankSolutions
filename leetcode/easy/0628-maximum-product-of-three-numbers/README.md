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
**Runtime:** 43 ms (beats 7.73%)  
**Memory:** 47.4 MB (beats 76.33%)  
**Submitted:** 2026-10-13T15:23:06.588Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums){
            result.add(num);
        }
        Collections.sort(result);
        int n=result.size();
        int max1=result.get(n-1)*result.get(n-2)*result.get(n-3);
        int max2 = result.get(0)*result.get(1)*result.get(n-1);
        return Math.max(max1, max2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)
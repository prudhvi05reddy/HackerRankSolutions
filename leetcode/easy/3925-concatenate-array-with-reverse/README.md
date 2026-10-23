# Concatenate Array With Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` of length `n`.

Construct a new array `ans` of length `2 * n` such that the first `n` elements are the same as `nums`, and the next `n` elements are the elements of `nums` in reverse order.

Formally, for `0 <= i <= n - 1`:

- ans[i] = nums[i]
- ans[i + n] = nums[n - i - 1]

Return an integer array `ans`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3]

 **Output:**  [1,2,3,3,2,1]

 **Explanation:** 

The first `n` elements of `ans` are the same as `nums`.

For the next `n = 3` elements, each element is taken from `nums` in reverse order:

- ans[3] = nums[2] = 3
- ans[4] = nums[1] = 2
- ans[5] = nums[0] = 1

Thus, `ans = [1, 2, 3, 3, 2, 1]`.

 **Example 2:** 

 **Input:**  nums = [1]

 **Output:**  [1,1]

 **Explanation:** 

The array remains the same when reversed. Thus, `ans = [1, 1]`.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 3.94%)  
**Memory:** 46.9 MB (beats 94.48%)  
**Submitted:** 2026-10-23T10:44:03.416Z  

```java
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[n-i-1];
        }
        int[] arr1 = new int[n+arr.length];
        for(int i=0;i<n;i++){
            arr1[i] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            arr1[nums.length+i] = arr[i];
        }
        return arr1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-array-with-reverse/)
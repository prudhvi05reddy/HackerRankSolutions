# Maximize Expression of Three Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Choose three elements `a`, `b`, and `c` from `nums` at  **distinct**  indices such that the value of the expression `a + b - c` is maximized.

Return an integer denoting the  **maximum possible value**  of this expression.

 

 **Example 1:** 

 **Input:**  nums = [1,4,2,5]

 **Output:**  8

 **Explanation:** 

We can choose `a = 4`, `b = 5`, and `c = 1`. The expression value is `4 + 5 - 1 = 8`, which is the maximum possible.

 **Example 2:** 

 **Input:**  nums = [-2,0,5,-2,4]

 **Output:**  11

 **Explanation:** 

We can choose `a = 5`, `b = 4`, and `c = -2`. The expression value is `5 + 4 - (-2) = 11`, which is the maximum possible.

 

 **Constraints:** 

- 3 <= nums.length <= 100
- -100 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 40.42%)  
**Memory:** 44.9 MB (beats 92.42%)  
**Submitted:** 2026-10-18T09:02:16.839Z  

```java
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        // int a = Integer.MIN_VALUE;
        // int b = Integer.MAX_VALUE;
        // int c = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > a) {
        //         c = a;
        //         a = nums[i];
        //     }
        //     else if (nums[i]>c) {
        //         c = nums[i];
        //     }
        //     if(nums[i] < b){
        //         b=nums[i];
        //     }
        // }
        // return a+c-b;
        // int c = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > c && (nums[i] != a || c == Integer.MIN_VALUE)) {
        //         c = nums[i];
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // result.add(a);// largest 
        // result.add(c);// second largest
        // result.add(b);//smallest
        // int ans = result.get(0) + result.get(1) - result.get(2);
        // return ans;
        int n=nums.length;
        Arrays.sort(nums);
        int ans=nums[n-1]+nums[n-2]-nums[0];
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximize-expression-of-three-elements/)
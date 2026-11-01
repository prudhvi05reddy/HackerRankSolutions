# Sort Array By Parity

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all the even integers at the beginning of the array followed by all the odd integers.

Return  ***any array**  that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 5.55%)  
**Memory:** 46.7 MB (beats 69.02%)  
**Submitted:** 2026-11-01T17:27:04.096Z  

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>  even = new ArrayList<>();
        ArrayList<Integer>  odd = new ArrayList<>();
        for(int num: nums){
            if(num % 2 == 0){
                even.add(num);
            }
            if(num % 2 != 0){
                odd.add(num);
            }
        }
        int[] arr = new int[nums.length];
        int c = 0;
        for(int num:even){
            arr[c] = num;
            c++;
        }
        for(int num:odd){
            arr[c] = num;
            c++;
        }
            
         return arr;
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity/)
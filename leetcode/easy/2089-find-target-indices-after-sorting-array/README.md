# Find Target Indices After Sorting Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  integer array `nums` and a target element `target`.

A  **target index**  is an index `i` such that `nums[i] == target`.

Return  *a list of the target indices of*  `nums` after *sorting* `nums` *in  **non-decreasing**  order*. If there are no target indices, return  *an  **empty**  list*. The returned list must be sorted in  **increasing**  order.

 

 **Example 1:** 

```
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

```

 **Example 2:** 

```
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

```

 **Example 3:** 

```
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i], target <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 75.48%)  
**Memory:** 44.3 MB (beats 96.72%)  
**Submitted:** 2026-10-19T11:07:54.004Z  

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
        }
        List <Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-target-indices-after-sorting-array/)
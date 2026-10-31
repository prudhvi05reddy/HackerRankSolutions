# Sort Array By Parity II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums`, half of the integers in `nums` are  **odd**, and the other half are  **even**.

Sort the array so that whenever `nums[i]` is odd, `i` is  **odd**, and whenever `nums[i]` is even, `i` is  **even**.

Return  *any answer array that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

```

 **Example 2:** 

```
Input: nums = [2,3]
Output: [2,3]

```

 

 **Constraints:** 

- 2 <= nums.length <= 2 * 104
- nums.length is even.
- Half of the integers in nums are even.
- 0 <= nums[i] <= 1000

 

 **Follow Up:**  Could you solve it in-place?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 6.74%)  
**Memory:** 48.3 MB (beats 70.75%)  
**Submitted:** 2026-10-31T14:16:30.001Z  

```java
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num : nums){
            if(num % 2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        int evn = 0;
        int od = 0;
        for(int i = 0 ;i<nums.length; i++){
                if( i % 2 ==0){
                    nums[i] = even.get(evn++);
                }
                else{
                    nums[i] = odd.get(od++);
                }
        }
            return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity-ii/)
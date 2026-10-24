# Second Largest Digit in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an alphanumeric string `s`, return  *the  **second largest**  numerical digit that appears in* `s` *, or* `-1` *if it does not exist*.

An  **alphanumeric**  string is a string consisting of lowercase English letters and digits.

 

 **Example 1:** 

```
Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

```

 **Example 2:** 

```
Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of only lowercase English letters and digits.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 6.29%)  
**Memory:** 46.2 MB (beats 5.08%)  
**Submitted:** 2026-10-24T15:45:26.278Z  

```java
class Solution {
    public int secondHighest(String s) {
       String numbers ="";
       for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                numbers= numbers + ch;
            }
        }
        if (numbers.length() < 2) {
          return -1;
}
        char[] arr = numbers.toCharArray();
        Arrays.sort(arr);
        numbers = new String(arr); 
        int result = arr[arr.length-2] - '0';
        for(int i = arr.length - 2 ; i>=0;i--){
            if(arr[i] - '0' < arr[arr.length - 1] - '0'){
                return arr[i]-'0';
            }
        }
        // if(arr[arr.length-2] - '0' == arr[arr.length-1] - '0'){
        //     return -1;
        // }
        // for(int i=0;i<s.length();i++){
        //     se = arr[s.length() -  1];
        // }
            return -1;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/second-largest-digit-in-a-string/)
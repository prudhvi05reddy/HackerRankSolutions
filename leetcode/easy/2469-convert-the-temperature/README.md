# Convert the Temperature

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a non-negative floating point number rounded to two decimal places `celsius`, that denotes the  **temperature in Celsius**.

You should convert Celsius into  **Kelvin**  and  **Fahrenheit**  and return it as an array `ans = [kelvin, fahrenheit]`.

Return  *the array `ans`.* Answers within `10-5` of the actual answer will be accepted.

 **Note that:** 

- Kelvin = Celsius + 273.15
- Fahrenheit = Celsius * 1.80 + 32.00

 

 **Example 1:** 

```
Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

```

 **Example 2:** 

```
Input: celsius = 122.11
Output: [395.26000,251.79800]
Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.

```

 

 **Constraints:** 

- 0 <= celsius <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.9 MB (beats 81.79%)  
**Submitted:** 2026-10-20T06:41:28.008Z  

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double fa= (celsius * 9.0/5.0) + 32.0;
        double [] arr = new double[2]; 
            arr[0] = k;
            arr[1] = fa;
        return arr;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/convert-the-temperature/)
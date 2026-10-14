# Q2. Employees Earning More Than Their Managers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Employee`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| salary      | int     |
| managerId   | int     |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.

```

 

Write a solution to find the employees who earn more than their managers.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Employee table:
+----+-------+--------+-----------+
| id | name  | salary | managerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | Null      |
| 4  | Max   | 90000  | Null      |
+----+-------+--------+-----------+
Output: 
+----------+
| Employee |
+----------+
| Joe      |
+----------+
Explanation: Joe is the only employee who earns more than his manager.

```

## Solution

**Language:** SQL  
**Runtime:** 473 ms (beats 24.10%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-14T15:33:17.083Z  

```sql

SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;

```

---

[View on LeetCode](https://leetcode.com/problems/employees-earning-more-than-their-managers/)
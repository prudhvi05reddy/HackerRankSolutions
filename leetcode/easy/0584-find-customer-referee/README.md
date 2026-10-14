# Q4. Find Customer Referee

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Customer`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

```

 

Find the names of the customer that are either:

- referred by any customer with id != 2.
- not referred by any customer.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
Output: 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+

```

## Solution

**Language:** SQL  
**Runtime:** 713 ms (beats 9.09%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-10-14T15:51:55.636Z  

```sql
# Write your MySQL query statement below
select name from customer where referee_id !=2 or referee_id Is NULL
```

---

[View on LeetCode](https://leetcode.com/problems/find-customer-referee/)
# Write your MySQL query statement below
select P.firstName,p.lastName,A.city,A.state from person as P left join Address a on P.personId = a.personId
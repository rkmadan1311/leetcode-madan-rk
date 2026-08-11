-- Last updated: 11/08/2026, 14:18:11
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
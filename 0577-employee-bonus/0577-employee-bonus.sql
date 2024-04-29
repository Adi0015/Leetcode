# Write your MySQL query statement below
select name ,bonus
from employee em left join bonus bo 
on em.empid = bo.empid
where bo.bonus < 1000 or bo.bonus is null
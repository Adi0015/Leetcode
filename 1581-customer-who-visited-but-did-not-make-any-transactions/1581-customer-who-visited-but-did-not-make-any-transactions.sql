# Write your MySQL query statement below

select customer_id ,count(vi.visit_id) as count_no_trans
from visits vi left join transactions tra 
on vi.visit_id = tra.visit_id
where tra.visit_id is null
group by customer_id
order by count(vi.visit_id) ASC
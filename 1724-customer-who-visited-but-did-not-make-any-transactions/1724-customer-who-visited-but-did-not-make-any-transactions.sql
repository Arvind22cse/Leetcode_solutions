# Write your MySQL query statement below
select customer_id,count(*) as count_no_trans
from
(select customer_id
from Visits
where visit_id not in
(select v.visit_id from Visits v join Transactions t
on v.visit_id=t.visit_id
)
) as vis
group by customer_id
# Write your MySQL query statement below
select p1.machine_id,Round(avg((p2.timestamp-p1.timestamp)),3) as processing_time
from Activity p1 join Activity p2
on p1.machine_id = p2.machine_id and p1.process_id=p2.process_id and
p1.activity_type="start" and p2.activity_type ="end"
group by p1.machine_id
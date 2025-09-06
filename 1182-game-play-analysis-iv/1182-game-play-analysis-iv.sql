select Round(sum(case when date_add(f.firstdate,interval 1 day)=a.event_date then 1 else 0 end)*1.0/count(distinct a.player_id),2) 
as fraction
from(
select player_id,min(event_date) AS firstdate from Activity
group by player_id
)as f
join Activity a on
f.player_id = a.player_id
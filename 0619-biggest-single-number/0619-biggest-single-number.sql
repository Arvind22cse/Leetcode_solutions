# Write your MySQL query statement below
select 
  CASE 
    WHEN (
      SELECT COUNT(*) 
      FROM (
        SELECT num
        FROM MyNumbers
        GROUP BY num
        HAVING COUNT(*) = 1
      ) AS unique_nums
    ) = 0 THEN NULL
else(
select num
from MyNumbers
group by num having count(*)=1 order by num desc limit 1
)
  END AS num;

# Write your MySQL query statement below
select Round(
((SELECT count(CASE WHEN order_date = customer_pref_delivery_date THEN 1 END) AS ct
FROM (
    SELECT * 
    FROM Delivery
    WHERE (customer_id, order_date) IN (
        SELECT customer_id, MIN(order_date)
        FROM Delivery
        GROUP BY customer_id
    )
) AS first_orders)
/
(SELECT  count(*) from(select min(order_date) from Delivery GROUP BY customer_id) AS first_orders))*100.00,2)

as immediate_percentage from Delivery order by immediate_percentage limit 1;


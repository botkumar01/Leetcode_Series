# Write your MySQL query statement below
select
product_id,
coalesce(round(tt/summ,2),0) as average_price
from(
    SELECT 
        p.product_id, 
            COALESCE(SUM(u.units * p.price), 0) AS tt, 
                COALESCE(SUM(u.units), 0) AS summ
                FROM Prices p
                LEFT JOIN UnitsSold u 
                    ON u.product_id = p.product_id
                       AND u.purchase_date BETWEEN p.start_date AND p.end_date
                       GROUP BY p.product_id
) as tt
-- where tt !=0 or summ != 0
# Write your MySQL query statement below
select
project_id,
round(avg(ex),2) as average_years 
from (
select
project_id,
(e.experience_years) as ex
from project p
join employee e on p.employee_id = e.employee_id) as tt
group by project_id
-- group by project_id
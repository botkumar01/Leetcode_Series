# Write your MySQL query statement below
select eu.unique_id,e.name
from employees e
join EmployeeUNI eu on e.id = eu.id;
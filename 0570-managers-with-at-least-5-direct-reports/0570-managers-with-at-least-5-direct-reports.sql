# Write your MySQL query statement belo
select
e.name
-- e.managerId 
from Employee e
join Employee r on e.id = r.managerId  
group by r.managerId 
having count(r.managerId) >= 5
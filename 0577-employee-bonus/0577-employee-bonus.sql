# Write your MySQL query statement below
select 
name,
case
when bonus is null then null
else bonus
end as bonus
from  employee e
left join bonus on bonus.empid = e.empid
where bonus<1000 or bonus is null
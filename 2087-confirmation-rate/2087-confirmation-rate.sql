-- SELECT
-- s.user_id,
-- count(c.user_id) as total
-- from (Signups s
-- left join Confirmations c on c.user_id = s.user_id
-- group by user_id)


select user_id,
case
when round(com/total,2) is null
then 0.00
else round(com/total,2)
end as confirmation_rate 

from (select
s.user_id,

sum(case when c.action ='confirmed' then 1
else 0
end) as com
,
count(c.user_id) as total
from signups s
left join Confirmations c on c.user_id = s.user_id
-- group by user_id) as toal
-- from Confirmations c
group by s.user_id) aaa
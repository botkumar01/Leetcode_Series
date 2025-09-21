select machine_id ,
round(avg(aa),3) as processing_time 
from 
(select 
a.machine_id ,
(-a.timestamp+  b.timestamp) as aa
from activity a
join activity b on a.process_id  = b.process_id and a.machine_id  = b.machine_id and a.activity_type='start' and b.activity_type='end') t
group by machine_id
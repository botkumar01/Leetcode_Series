SELECT w.id
from weather w, weather v
where datediff(w.recordDate ,v.recordDate ) =1 and w.temperature > v.temperature
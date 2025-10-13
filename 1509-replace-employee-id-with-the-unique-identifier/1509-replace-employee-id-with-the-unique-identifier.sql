select e.unique_id , ee.name
from employees ee
Left join EmployeeUNI e on e.id=ee.id

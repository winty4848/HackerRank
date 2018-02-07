select case when grade < 8 then 'NULL' when grade >=8 then name end as name, grade, marks
from students s inner join grades g 
on s.marks between g.min_mark and g.max_mark
order by grade desc, name, marks;
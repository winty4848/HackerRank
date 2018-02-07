select city, length(city)
from(select city, rownum as r from
         (select city, length(city)
         from station
         order by length(city) desc, city desc)
     )
where r=1 or r=(select max(rownum) from station)
;
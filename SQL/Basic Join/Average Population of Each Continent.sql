select co.continent, trunc(avg(ci.population))
from city ci inner join country co
on ci.countrycode=co.code
group by co.continent
;

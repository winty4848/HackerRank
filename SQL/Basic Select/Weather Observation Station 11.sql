select distinct city from station
where not (lower(substr(city,1,1)) in ('a','e','i','o','u') and substr(city,-1) in ('a','e','i','o','u'));
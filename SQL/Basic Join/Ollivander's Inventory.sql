select id, age, coin, power from (
    select w.id as id, wp.age as age, w.coins_needed as coin, w.power as power, row_number() over (partition by age,power order by w.coins_needed) as rownumber
    from wands_property wp inner join wands w
    on wp.code=w.code
    where wp.is_evil=0
    order by power desc, age desc)
where rownumber=1;
select id, name, totalch
from (select id, name, totalch, count(totalch) over (partition by totalch) as count_number, max(totalch) over () as maxcount
from (select h.hacker_id as id, h.name as name, count(c.hacker_id) as totalch
        from hackers h inner join challenges c
        on h.hacker_id=c.hacker_id
        group by h.hacker_id, h.name)
     )
where count_number=1 or totalch=maxcount
order by totalch desc, id;
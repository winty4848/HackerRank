select id, name
from(
select h.name as name, h.hacker_id as id, count(name) as counting
from (submissions s inner join hackers h on s.hacker_id=h.hacker_id
              inner join challenges c on s.challenge_id=c.challenge_id
              inner join difficulty d on c.difficulty_level=d.difficulty_level)
where d.score=s.score
group by h.name, h.hacker_id) --inner select end
where counting>1
order by counting desc, id;


select h_id, name, sum(max_score) as score
from (select h.hacker_id as h_id, s.challenge_id as c_id, h.name as name, max(s.score) as max_score
      from hackers h inner join submissions s
      on h.hacker_id=s.hacker_id
      where s.score>0
      group by h.hacker_id, h.name, s.challenge_id)
group by h_id, name
order by score desc, h_id ;
create or replace view match_participants as
select p.* 
from match m 
  cross join lateral (
    values
    (m.year, m.match, m.team_1),
    (m.year, m.match, m.team_2)
  ) as p(year, match, team);

update team set region = 'r1' where id in (select team from match_participants where match < 8);
update team set region = 'r2' where id in (select team from match_participants where match >= 8 and match < 16);
update team set region = 'r3' where id in (select team from match_participants where match >= 16 and match < 24);
update team set region = 'r4' where id in (select team from match_participants where match >= 24 and match < 32);

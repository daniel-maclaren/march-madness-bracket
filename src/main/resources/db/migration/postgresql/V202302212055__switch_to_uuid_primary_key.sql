drop view if exists winner;
drop table if exists match;
drop table if exists team;

create table team
(
    id uuid primary key default gen_random_uuid (),
    name text not null constraint team_name_length check (char_length(name) <= 40),
    year smallint,
    seed smallint constraint team_seed_value check(seed between 1 and 16),
    region text not null constraint team_region_length check (char_length(region) <= 40)
);

create table match
(
    id uuid primary key default gen_random_uuid (),
    year smallint,
    match smallint constraint match_value check (match between 0 and 63),
    round smallint constraint round_value check (round between 1 and 7),
    team_1 uuid references team(id),
    team_1_score smallint,
    team_2 uuid references team(id),
    team_2_score smallint,
    unique (year, match)
);

create or replace view winner as
select id,
       year,
       match,
       round,
       case when team_1_score > team_2_score
            then team_1
            else team_2
       end as winner
from match;

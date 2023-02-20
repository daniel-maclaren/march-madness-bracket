drop table match_position;

create table team
(
    id int primary key generated always as identity,
    name text not null constraint team_name_length check (char_length(name) <= 40),
    year smallint,
    seed smallint constraint team_seed_value check(seed between 1 and 16),
    region text not null constraint team_region_length check (char_length(region) <= 40)
);

create table match
(
    id int primary key generated always as identity,
    year smallint,
    match smallint constraint match_value check (match between 0 and 63),
    round smallint constraint round_value check (round between 1 and 7),
    team_1 int references team(id),
    team_1_score smallint,
    team_2 int references team(id),
    team_2_score smallint,
    unique (year, match)
);
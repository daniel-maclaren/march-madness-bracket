create table match_position
(
    id int primary key generated always as identity,
    year smallint,
    match smallint constraint match_value check (match between 0 and 63),
    position smallint constraint position_value check (position between 0 and 1),
    team_name text not null constraint team_name_length check (char_length(team_name) <= 40),
    team_seed smallint constraint team_seed_value check(team_seed between 1 and 16),
    team_region text not null constraint team_region_length check (char_length(team_region) <= 40),
    round smallint constraint round_value check (round between 1 and 7),
    score smallint,
    unique (year, match, position)
);
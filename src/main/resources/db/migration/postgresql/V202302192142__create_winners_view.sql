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

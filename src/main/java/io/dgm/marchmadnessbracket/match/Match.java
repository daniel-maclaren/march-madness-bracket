package io.dgm.marchmadnessbracket.match;

import io.dgm.marchmadnessbracket.bracket.MatchDto;
import io.dgm.marchmadnessbracket.team.Team;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private short year;

    private short match;

    private short round;

    @Column(name = "team_1")
    private UUID team1;

    @Column(name = "team_1_score")
    private short team1Score;

    @Column(name = "team_2")
    private UUID team2;

    @Column(name = "team_2_score")
    private short team2Score;

    public Match() {
    }

    public Match(MatchDto dto, List<Team> teams) {
        this.year = dto.year();
        this.match = dto.match();
        this.round = dto.round();

        // MatchDto refers to teams via their index in the teams list.
        this.team1 = teams.get(dto.team1()).getId();
        this.team1Score = dto.team1Score();
        this.team2 = teams.get(dto.team2()).getId();
        this.team2Score = dto.team2Score();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getMatch() {
        return match;
    }

    public void setMatch(short match) {
        this.match = match;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }

    public UUID getTeam1() {
        return team1;
    }

    public void setTeam1(UUID team1) {
        this.team1 = team1;
    }

    public short getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(short team1Score) {
        this.team1Score = team1Score;
    }

    public UUID getTeam2() {
        return team2;
    }

    public void setTeam2(UUID team2) {
        this.team2 = team2;
    }

    public short getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(short team2Score) {
        this.team2Score = team2Score;
    }
}

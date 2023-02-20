package io.dgm.marchmadnessbracket.match;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private short year;

    private short match;

    private short round;

    @Column(name = "team_1")
    private int team1;

    @Column(name = "team_1_score")
    private short team1Score;

    @Column(name = "team_2")
    private int team2;

    @Column(name = "team_2_score")
    private short team2Score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public short getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(short team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    public short getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(short team2Score) {
        this.team2Score = team2Score;
    }
}

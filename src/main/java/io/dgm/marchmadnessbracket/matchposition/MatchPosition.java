package io.dgm.marchmadnessbracket.matchposition;

import jakarta.persistence.*;

@Entity
@Table(name = "match_position")
public class MatchPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private short year;

    private short match;

    private short position;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "team_seed")
    private short teamSeed;

    @Column(name = "team_region")
    private String teamRegion;

    private short round;

    private short score;

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

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public short getTeamSeed() {
        return teamSeed;
    }

    public void setTeamSeed(short teamSeed) {
        this.teamSeed = teamSeed;
    }

    public String getTeamRegion() {
        return teamRegion;
    }

    public void setTeamRegion(String teamRegion) {
        this.teamRegion = teamRegion;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }
}

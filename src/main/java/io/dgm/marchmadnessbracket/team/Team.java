package io.dgm.marchmadnessbracket.team;

import io.dgm.marchmadnessbracket.bracket.TeamDto;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private short year;

    private short seed;

    private String region;

    public Team() {
    }

    public Team(TeamDto dto) {
        this.name = dto.name().trim();
        this.year = dto.year();
        this.seed = dto.seed();
        this.region = dto.region();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getSeed() {
        return seed;
    }

    public void setSeed(short seed) {
        this.seed = seed;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

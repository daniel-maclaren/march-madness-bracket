package io.dgm.marchmadnessbracket.bracket;

public record MatchDto(
        short year,
        short match,
        short round,
        int team1,
        short team1Score,
        int team2,
        short team2Score) {
}

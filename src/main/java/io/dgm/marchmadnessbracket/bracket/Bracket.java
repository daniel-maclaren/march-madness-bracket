package io.dgm.marchmadnessbracket.bracket;

import io.dgm.marchmadnessbracket.match.Match;
import io.dgm.marchmadnessbracket.team.Team;

import java.util.List;

public record Bracket(List<Team> teams, List<Match> matches) {
}

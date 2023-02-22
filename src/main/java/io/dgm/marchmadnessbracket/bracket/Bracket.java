package io.dgm.marchmadnessbracket.bracket;

import java.util.List;

public record Bracket(List<TeamDto> teams, List<MatchDto> matches) {
}

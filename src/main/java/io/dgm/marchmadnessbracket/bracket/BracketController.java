package io.dgm.marchmadnessbracket.bracket;

import io.dgm.marchmadnessbracket.match.Match;
import io.dgm.marchmadnessbracket.match.MatchRepository;
import io.dgm.marchmadnessbracket.team.Team;
import io.dgm.marchmadnessbracket.team.TeamRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/bracket")
public class BracketController {
    private final TeamRepository teamRepository;

    private final MatchRepository matchRepository;

    public BracketController(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @PostMapping
    @Transactional
    public void create(@RequestBody Bracket bracket) {
        List<Team> teams = bracket
                .teams()
                .stream()
                .map(Team::new)
                .collect(Collectors.toList());

        teamRepository.saveAll(teams);

        List<Match> matches = bracket
                .matches()
                .stream()
                .map(m -> new Match(m, teams))
                .collect(Collectors.toList());

        matchRepository.saveAll(matches);
    }
}

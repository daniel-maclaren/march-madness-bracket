package io.dgm.marchmadnessbracket.bracket;

import io.dgm.marchmadnessbracket.match.MatchRepository;
import io.dgm.marchmadnessbracket.team.TeamRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        bracket.teams().forEach(t -> t.setName(t.getName().trim()));
        teamRepository.saveAll(bracket.teams());

        // Matches refer to teams via their index in the teams list. Before saving matches,
        // we need to switch the index number to the team ID assigned by the database.
        bracket.matches().forEach(m -> {
            m.setTeam1(bracket.teams().get(m.getTeam1()).getId());
            m.setTeam2(bracket.teams().get(m.getTeam2()).getId());
        });
        matchRepository.saveAll(bracket.matches());
    }
}

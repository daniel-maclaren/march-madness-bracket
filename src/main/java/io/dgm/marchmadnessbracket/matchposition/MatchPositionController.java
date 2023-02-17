package io.dgm.marchmadnessbracket.matchposition;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/match-position")
public class MatchPositionController {
    private final MatchPositionRepository matchPositionRepository;

    public MatchPositionController(MatchPositionRepository matchPositionRepository) {
        this.matchPositionRepository = matchPositionRepository;
    }

    @PostMapping
    public void create(@RequestBody Iterable<MatchPosition> matchPositions) {
        matchPositionRepository.saveAll(matchPositions);
    }
}

package io.dgm.marchmadnessbracket.match;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MatchRepository extends CrudRepository<Match, UUID> {
}

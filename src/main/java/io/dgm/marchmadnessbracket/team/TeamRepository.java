package io.dgm.marchmadnessbracket.team;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeamRepository extends CrudRepository<Team, UUID> {
}

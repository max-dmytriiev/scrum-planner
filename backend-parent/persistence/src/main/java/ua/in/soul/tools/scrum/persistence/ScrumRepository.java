package ua.in.soul.tools.scrum.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.in.soul.tools.scrum.domain.Scrum;

import java.util.List;
import java.util.UUID;

@Repository
public interface ScrumRepository extends JpaRepository<Scrum, UUID> {
    List<Scrum> findAllByNameLike(String name);
}

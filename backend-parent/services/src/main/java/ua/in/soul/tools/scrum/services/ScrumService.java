package ua.in.soul.tools.scrum.services;

import ua.in.soul.tools.scrum.domain.Scrum;

import java.util.List;

public interface ScrumService {
    List<Scrum> findByName(String name);
}

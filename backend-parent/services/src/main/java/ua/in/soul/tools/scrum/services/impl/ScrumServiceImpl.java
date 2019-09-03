package ua.in.soul.tools.scrum.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.in.soul.tools.scrum.domain.Scrum;
import ua.in.soul.tools.scrum.persistence.ScrumRepository;
import ua.in.soul.tools.scrum.services.ScrumService;
import ua.in.soul.tools.scrum.util.StringUtil;

import java.util.List;

@Service
public class ScrumServiceImpl implements ScrumService {

    @Autowired
    private ScrumRepository scrumRepository;

    @Override
    public List<Scrum> findByName(String name) {
        return scrumRepository.findAllByNameLike(StringUtil.wrapAround(name, "%"));
    }
}

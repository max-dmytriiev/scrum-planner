package ua.in.soul.tools.scrum.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("ping")
    public String ping() {
        return "OK";
    }
}

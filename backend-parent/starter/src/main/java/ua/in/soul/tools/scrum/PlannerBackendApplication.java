package ua.in.soul.tools.scrum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import ua.in.soul.tools.scrum.persistence.internal.AuditingDateTimeProvider;

@EnableJpaAuditing(dateTimeProviderRef = AuditingDateTimeProvider.BEAN_NAME)
@SpringBootApplication
public class PlannerBackendApplication extends SpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlannerBackendApplication.class, args);
    }
}

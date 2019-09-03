package ua.in.soul.tools.scrum.persistence.internal;

import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.Optional;

@Component(AuditingDateTimeProvider.BEAN_NAME)
public class AuditingDateTimeProvider implements DateTimeProvider {
    public static final String BEAN_NAME = "auditingDateTimeProvider";

    @Override
    @Nonnull
    public Optional<TemporalAccessor> getNow() {
        return Optional.of(ZonedDateTime.now());
    }
}
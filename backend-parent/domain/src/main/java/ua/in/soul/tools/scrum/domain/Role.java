package ua.in.soul.tools.scrum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "role")
@EqualsAndHashCode(callSuper = true, exclude = "scrum")
@ToString(exclude = "scrum")
public class Role extends AuditingUuidEntity {

    @NotNull
    @Size(max = 255)
    private String name;

    @JsonIgnore
    @JoinColumn(name = "scrum_id")
    @ManyToOne(
            targetEntity = Scrum.class,
            fetch = FetchType.LAZY, optional = false)
    private Scrum scrum;
}

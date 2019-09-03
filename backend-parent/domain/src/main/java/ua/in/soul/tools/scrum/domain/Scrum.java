package ua.in.soul.tools.scrum.domain;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@Table(name = "scrum")
@EqualsAndHashCode(callSuper = true)
public class Scrum extends AuditingUuidEntity {

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 4)
    private String pin;

    @OneToMany(
            targetEntity = Role.class, mappedBy = "scrum",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Role> roles = Lists.newArrayList();

    public void addRole(Role role) {
        role.setScrum(this);
        roles.add(role);
    }

    public void removeRole(Role role) {
        role.setScrum(null);
        roles.remove(role);
    }

    public void clearRoles() {
        roles.forEach(this::removeRole);
    }
}



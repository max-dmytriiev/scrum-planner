#Scrum Planner

A handy tool for conducting Scrum estimation sessions

---

#### Dev environment setup

1. Install the following:
    - JDK 8 (Oracle preferred)
    - Apache Maven 3.5+
    - MariaDB 10.4+
    - Intellij IDEA with plugins for:
        - Lombok
        - Checkstyle

2. Set environment variables:
    - SCPL_HOST - database host (localhost or whatever)
    - SCPL_PORT - database port (3306 mariadb)
    - SCPL_SCHEMA - development schema name (scpl-dev)
    - SCPL_USER - database username
    - SCPL_PASS - database password
    
3. Build everything using ```mvn clean install```

4. Run backend server using ```PlannerBackendApplication.java```
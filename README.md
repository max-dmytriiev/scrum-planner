# Scrum Planner

A small tool for conducting Scrum estimation sessions

---

#### Dev environment setup

0. Clone project from http://gerrithub.io **with commit-msg hook** using your ssh credentials or **anonymous http**
    ```
    git clone "https://review.gerrithub.io/max-dmytriiev/scrum-planner" && (cd "scrum-planner" && mkdir -p .git/hooks && curl -Lo `git rev-parse --git-dir`/hooks/commit-msg https://review.gerrithub.io/tools/hooks/commit-msg; chmod +x `git rev-parse --git-dir`/hooks/commit-msg)
    ```
1. Setup your git username, email and gerrit **review** command:
    ```
    git config user.name "John Smith"
    git config user.email "John_Smith@gmail.com"
   
    git config alias.review '!bash -c "git push origin HEAD:refs/for/$1" -'
    ```
2. Install the following:
    - JDK 8 (Oracle preferred)
    - Apache Maven 3.5+
    - MariaDB 10.4+
    - Intellij IDEA with plugins for:
        - Lombok
        - Checkstyle

3. Set environment variables:
    - ```SCPL_HOST``` - database host (localhost or whatever)
    - ```SCPL_PORT``` - database port (3306 mariadb)
    - ```SCPL_SCHEMA``` - development schema name (scpl-dev)
    - ```SCPL_USER``` - database username
    - ```SCPL_PASS``` - database password
    
4. Build everything using ```mvn clean install```

5. Run backend server using ```PlannerBackendApplication.java```
# Sample Spring Boot Maven Project

Short description
- A Java Spring Boot application built with Maven. Replace project-specific details (artifactId, main class, endpoints) as needed.

Prerequisites
- Java 17 or later installed and `JAVA_HOME` configured.
- Maven 3.6+ or use the included Maven Wrapper (`mvnw` / `mvnw.cmd`).
- IntelliJ IDEA for development (project tested with IntelliJ IDEA 2025.3.2 on Windows).

Build and run (Windows)
- Using Maven Wrapper:
    - Build: `.\mvnw.cmd clean package`
    - Run (jar): `java -jar target\<artifactId>-<version>.jar` (check `pom.xml` for exact name)
    - Run (dev): `.\mvnw.cmd spring-boot:run`
- Using system Maven:
    - Build: `mvn clean package`
    - Run (dev): `mvn spring-boot:run`

Run from IntelliJ
- Open the project folder in IntelliJ.
- Let IntelliJ import the Maven project.
- Run the main class (annotated with `@SpringBootApplication`) or use the provided run configuration.

Configuration
- Application properties: `src/main/resources/application.properties` or `src/main/resources/application.yml`
- Externalize secrets/config using environment variables or a config server.

Testing
- Run unit/integration tests:
    - `.\mvnw.cmd test` or `mvn test`
- Use IntelliJ test runner for class-level or package-level runs.

Common Maven commands
- Clean and install: `.\mvnw.cmd clean install`
- Package skipping tests: `.\mvnw.cmd -DskipTests package`
- Run a single test: `.\mvnw.cmd -Dtest=YourTestClass#method test`

Logging and troubleshooting
- Check logs printed to the console when running locally.
- Adjust log level in `application.properties`:
    - `logging.level.root=INFO`

API and endpoints
- Inspect controller classes in `src/main/java` to find available REST endpoints.
- If Spring Actuator is enabled, common endpoints: `/actuator/health`, `/actuator/info`.

Project structure (typical)
- `src/main/java` — application source
- `src/main/resources` — config and static resources
- `src/test/java` — tests
- `pom.xml` — Maven build file

Contributing
- Follow existing code style and tests.
- Open pull requests against the main branch and include descriptive commit messages.

License
- Add a license file as appropriate (e.g., `LICENSE`).

Notes
- Replace placeholders (artifactId, version, main class) with values from `pom.xml`.

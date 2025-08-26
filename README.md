# Escola/Universidade (PostgreSQL + Docker Compose)

API REST para **Universidades, Cursos e Alunos** com Spring Boot 3, JPA, Liquibase e PostgreSQL via Docker.

## Subir infraestrutura
```bash
docker-compose up -d
```

## Rodar a aplicação
```bash
./gradlew bootRun
# ou
./gradlew clean build && java -jar build/libs/escola-universidade-postgres-0.0.1.jar
```

## Endpoints principais
- `GET /api/universidades`
- `POST /api/universidades`
- `GET /api/universidades/{id}/cursos`
- `POST /api/universidades/{id}/cursos`
- `GET /api/cursos/{id}/alunos`
- `POST /api/cursos/{id}/alunos`

Swagger UI: `/swagger-ui.html`

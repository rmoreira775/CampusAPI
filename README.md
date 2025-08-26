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

# 🎓 Escola & Universidade - API

API REST desenvolvida em **Spring Boot 3** para gerenciamento de **Universidades, Cursos e Alunos**, utilizando **PostgreSQL** via **Docker Compose** e versionamento de banco com **Liquibase**.

---

## 🧐 Para que serve este projeto?

Este projeto simula um sistema de gestão acadêmica simplificado, onde é possível:

- **Cadastrar universidades** com seus dados básicos.
- **Relacionar cursos** a cada universidade.
- **Gerenciar alunos**, vinculando-os aos cursos.
- **Expor APIs REST** que podem ser consumidas por aplicações web, mobile ou sistemas legados.

👉 É uma base prática para aprender e aplicar conceitos de **arquitetura em camadas**, **modelagem de entidades**, **persistência com JPA/Hibernate** e **documentação de APIs**.

Pode ser usado tanto para **aprendizado** quanto como ponto de partida para sistemas acadêmicos mais robustos.

---

## 🚀 Tecnologias

- Java 17
- Spring Boot 3 (Web, Data JPA, Validation)
- PostgreSQL + Docker Compose
- Liquibase (migração de banco)
- Swagger / OpenAPI (documentação)
- Gradle

---

## 📌 Entendendo o Desafio

Agora é a sua hora de brilhar e construir um perfil de destaque no GitHub! 🚀

Este projeto nasceu como uma **evolução prática** do desafio [Board da DIO](https://github.com/digitalinnovationone/board).  
Enquanto o projeto original era focado em um **quadro de tarefas**, aqui o foco foi trazer o contexto para o **ambiente acadêmico** 🎓.

Ou seja: em vez de cards e colunas, trabalhamos com **Universidades, Cursos e Alunos**, criando uma API REST organizada e extensível.

👉 A ideia é que você possa usar este projeto para:

- Praticar **Spring Boot + PostgreSQL** em um caso realista.  
- Mostrar no seu **portfólio GitHub** como você aplica boas práticas.  
- Evoluir a solução com melhorias próprias (login, professores, disciplinas, notas etc.).

Assim como no desafio da DIO, a recomendação é: **crie o seu próprio repositório, faça melhorias e compartilhe!** Isso pode fazer diferença em entrevistas técnicas 😎

---

## 💡 Possíveis Melhorias

Este projeto é uma versão **lite**, mas pode evoluir bastante com:

- **Autenticação & Autorização**  
  Implementar login de usuários com Spring Security e JWT.  
  Exemplo: diferenciar permissões entre administradores, professores e alunos.

- **Validações avançadas**  
  Regras como matrícula única, limites de vagas por curso, email institucional etc.

- **Relacionamento Professor ↔ Disciplina**  
  Incluir professores e disciplinas, associando-os aos cursos já existentes.

- **Paginação e Filtros nas consultas**  
  Ex.: listar alunos de um curso com paginação (`/alunos?cursoId=1&page=0&size=10`).

- **Testes automatizados**  
  Unitários (JUnit + Mockito) e de integração para garantir robustez.

- **Deploy em Nuvem**  
  Configuração para rodar no **Heroku, Railway ou AWS ECS**, com banco Postgres na nuvem.

---

## 📖 Endpoints Principais

### 🎓 Universidades

- `GET /universidades` → lista todas
- `POST /universidades` → cria uma nova
- `GET /universidades/{id}` → busca por ID

### 📚 Cursos

- `GET /cursos`
- `POST /cursos`
- `GET /cursos/{id}`

### 👩‍🎓 Alunos

- `GET /alunos`
- `POST /alunos`
- `GET /alunos/{id}`

---

## 🧪 Exemplos de Requisições

### Criar Universidade

```json
POST /universidades
{
  "nome": "Universidade Federal de Tecnologia",
  "endereco": "Av. Principal, 1000"
}


# Sistema de Hábitos API

API REST para gerenciamento de hábitos diários, desenvolvida com Spring Boot e MySQL.

## Tecnologias

- Java 17
- Spring Boot 
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Git

## Funcionalidades

- [x] Criar hábito (POST)
- [x] Listar hábitos (GET)
- [x] Buscar por ID (GET)
- [x] Atualizar hábito (PUT)
- [x] Deletar hábito (DELETE)


## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/habitos` | Criar hábito |
| GET | `/habitos` | Listar todos |
| GET | `/habitos/{id}` | Buscar por ID |
| PUT | `/habitos/{id}` | Atualizar |
| DELETE | `/habitos/{id}` | Deletar |

## Autor

Matheus Cardoso Da Costa

## Licença

MIT
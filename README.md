# User Management API - Spring Boot

Este é um projeto de exemplo em Spring Boot demonstrando o padrão MVC (Model-View-Controller) com uma API REST simples para gerenciamento de usuários.

## Tecnologias utilizadas
- Java 21
- Spring Boot 3.5.6
- Maven
- Lombok
- Spring Web
- Spring Data JPA
- PostgreSQL

## Estrutura do projeto
- **Controller:** Recebe requisições HTTP e chama os serviços correspondentes.  
  - `UserController.java`
- **Service:** Contém a lógica de negócio.  
  - `UserService.java`
- **Model:** Representa os dados da aplicação.  
  - `User.java`
- **Repository:** Responsável por acessar o banco de dados.  
  - `UserRepository.java`
- **DTO:** Transfere dados de forma segura (sem expor a senha).  
  - `UserNameDTO.java`

## Configuração do PostgreSQL
1. Crie um banco de dados chamado `userResgister`.  
```sql
CREATE DATABASE userResgister;

CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    senha VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE
);

Configure o application.properties para conectar ao PostgreSQL:

spring.datasource.url=jdbc:postgresql://localhost:5432/userdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Execute a aplicação Spring Boot.

Endpoints disponíveis
Base URL: http://localhost:3000/user

POST /register
Registra um novo usuário.

Exemplo de requisição:

http
POST /user/register
Content-Type: application/json

{
  "name": "Murilo",
  "email": "murilo@example.com",
  "senha": "123456"
}
Resposta:

json
{
  "id": 1,
  "name": "Murilo",
  "email": "murilo@example.com",
  "senha": "123456"
}
GET /users
Retorna a lista de todos os usuários (inclui a senha, usar apenas para testes).

Exemplo de requisição:

http
GET /user/users
Resposta:

json
[
  {
    "id": 1,
    "name": "Murilo",
    "email": "murilo@example.com",
    "senha": "123456"
  }
]
GET /name
Retorna a lista de usuários com dados seguros, sem a senha.

Exemplo de requisição:

http
GET /user/name
Resposta:

json
[
  {
    "id": 1,
    "name": "Murilo",
    "email": "murilo@example.com"
  }
]

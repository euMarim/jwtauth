# Prova-POO JWT Authentication API

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, implementando **autenticação JWT**, controle de acesso por roles (ADMIN e USER), e gerenciamento de usuários.

## Tecnologias

- Java 17
- Spring Boot 3+
- Spring Security
- JWT (JSON Web Token)
- H2 Database
- JPA
- Maven

## Funcionalidades

- Registro de usuários (com role ADMIN ou USER)
- Login com autenticação JWT
- Proteção de endpoints com tokens
- Criação, leitura, atualização e deleção de usuários
- Acesso seguro baseado em roles

## Como rodar o projeto

### Pré-requisitos

- Java 17+
- IDE (IntelliJ)
- Postman (ou outro cliente HTTP)

### Passos

1. Clone o projeto:

Usando Intellij
```
 - Abra o IntelliJ, na aba superior procure por "Get from Version Control..."
 - Abrira uma tela:
              Version control: Git
              URL: "copie o HTTPS e cole  (https://github.com/euMarim/jwtauth.git)"
              Directory: Seleciona o ideal para você.
 - Click "Clone".
 - Perfeito clone do git feito.
```
### Endpoints principais

## Autenticação
| Método | Rota             | Descrição         |
|--------|------------------|-------------------|
| POST   | `/auth/register` | Cadastro de usuário (ADMIN/USER) |
| POST   | `/auth/login`    | Login e retorno do token |

## Usuários
| Método | Rota              | Descrição                |
|--------|-------------------|--------------------------|
| GET    | `/user`           | Listar todos os usuários (Somente ADMIN tem acesso) |
| GET    | `/user/{id}`      | Buscar usuário por ID    |
| DELETE | `/user/{id}`      | Deletar usuário (Somente ADMIN tem acesso)  |
| PUT    | `/user/edit`      | Atualizar próprio perfil |
| PUT    | `/user/{id}`      | Atualizar qualquer usuário (Somente ADMIN tem acesso) |

## 🪪 Exemplo de autenticação com token JWT

1. Faça login em `/auth/login`
2. Copie o token recebido
3. Envie nas requisições protegidas no header:

```
Authorization: Bearer SEU_TOKEN_AQUI

# API REST Cloud ☁️

API REST construída com Java 21 + Spring Boot, simulando uma aplicação de serviços em nuvem. Projeto estruturado com boas práticas e pronto para deploy em Cloud.

# 🔧 Tecnologias utilizadas:

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL (configurável)
- Gradle
- Docker (Dockerfile incluso)
- Railway (deploy cloud-ready)
- GitHub Actions (opcional para CI/CD)

## 📁 Estrutura do projeto:

src
├── main
│ ├── java
│ │ └── api_rest_cloud
│ │ ├── controller
│ │ ├── domain.model
│ │ ├── domain.repository
│ │ ├── service / impl
│ │ └── Application.java
│ └── resources
│ ├── application-dev.yml
│ └── application-prd.yml
└── test

markdown
Copiar
Editar

## ⚙️ Funcionalidades principais:

### 👤 Usuários
- Cadastro e listagem de usuários
- Obtenção de dados da conta, cartões e funcionalidades
- Tratamento de exceções com handler global

### 💳 Conta e Cartões
- Modelos associados ao usuário
- Dados fictícios usados para simulação de banco digital

### 📰 Notícias
- Listagem de conteúdo informativo simulando notícias financeiras

---

## ▶️ Como executar o projeto:

### Pré-requisitos
- Java 21
- Gradle
- PostgreSQL (ou outro banco compatível)
- (Opcional) Docker ou Railway CLI

### 1. Clone o repositório

git clone https://github.com/ocarlosabrantes/api-rest-cloud.git
cd api-rest-cloud

## 2. Configure o application-dev.yml

Edite src/main/resources/application-dev.yml com os dados do seu banco:

yaml
Copiar
Editar
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/nome_do_banco
    username: seu_usuario
    password: sua_senha

🔌 Endpoints disponíveis
Método	Endpoint	Descrição
GET	/users	Lista todos os usuários
GET	/users/{id}	Detalhes de um usuário
POST	/users	Criação de novo usuário

(Outros endpoints são definidos conforme as entidades Account, Card, Feature, etc.)

 ### 🚀 Deploy na Cloud
Este projeto está pronto para deploy no Railway, Render, Fly.io ou qualquer PaaS com suporte a Java:

Railway (exemplo)
Crie um novo projeto

Conecte seu GitHub

Configure variáveis de ambiente

O Dockerfile e Procfile já estão prontos para uso

### 🧪 Testes
O projeto já possui estrutura inicial para testes com JUnit:

bash
Copiar
Editar
./gradlew test

👨‍💻 Autor
Carlos Henrique Abrantes
Estudante de Java, Cloud AWS e desenvolvimento back-end.
📍 Guarulhos - SP | LinkedIn

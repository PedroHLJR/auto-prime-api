# 🚗 Auto Prime API

> API RESTful para a loja fictícia de carros **Auto Prime**, desenvolvida com Java e Spring Boot.

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Tecnologias](#-tecnologias)
- [Estrutura da API](#-estrutura-da-api)
- [Endpoints](#-endpoints)
- [Como Executar](#-como-executar)
- [Banco de Dados](#-banco-de-dados)
- [Frontend](#-frontend)
- [Autor](#-autor)

---

## 📌 Sobre o Projeto

A **Auto Prime API** é uma aplicação back-end que fornece serviços para uma loja fictícia de automóveis. Ela gerencia o catálogo de veículos expondo endpoints REST consumidos pelo front-end da aplicação.

---

## 🛠 Tecnologias

| Camada         | Tecnologia        |
|----------------|-------------------|
| Linguagem      | Java 25           |
| Framework      | Spring Boot 4     |
| Banco de Dados | SQL Server        |
| Build          | Maven             |
| Testes         | JUnit 5           |
| Documentação   | Swagger (OpenAPI) |

---

## 🗂 Estrutura da API

```
auto-prime-api/
├── src/
│   └── main/
│       ├── java/com/auto_prime/demo/
│       │   ├── controller/
│       │   │   └── VeiculoController.java
│       │   ├── model/
│       │   │   └── Veiculo.java
│       │   ├── repository/
│       │   │   └── VeiculoRepository.java
│       │   ├── service/
│       │   │   └── VeiculoService.java
│       │   └── AutoPrimeApplication.java
│       │
│       └── resources/
│           ├── application.properties
│           └── application.properties.example
│
└── pom.xml
```

---

## 📡 Endpoints

### 🚘 Veículos — `/api/veiculos`

| Método | Rota                              | Descrição                       |
|--------|-----------------------------------|---------------------------------|
| GET    | `/api/veiculos`                   | Lista todos os veículos         |
| GET    | `/api/veiculos/{id}`              | Busca um veículo por ID         |
| GET    | `/api/veiculos/marca/{marca}`     | Filtra veículos por marca       |
| GET    | `/api/veiculos/situacao/{situacao}` | Filtra veículos por situação  |
| POST   | `/api/veiculos`                   | Cadastra um novo veículo        |
| PUT    | `/api/veiculos/{id}`              | Atualiza dados de um veículo    |
| DELETE | `/api/veiculos/{id}`              | Remove um veículo               |

**Exemplo de body (POST/PUT):**
```json
{
  "marca": "Toyota",
  "modelo": "Corolla",
  "ano": 2023,
  "cor": "Prata",
  "placa": "ABC1D234",
  "chassi": "9BWZZZ377VT004251",
  "kmRodados": 0,
  "preco": 145000.00,
  "situacao": "Disponível",
  "descricao": "Veículo seminovo em ótimo estado."
}
```

---

## ▶ Como Executar

### Pré-requisitos

- Java 25
- Maven 3.8+
- SQL Server rodando localmente

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/PedroHLJR/auto-prime-api.git

# 2. Entre na pasta do projeto
cd auto-prime-api

# 3. Copie o arquivo de exemplo e configure com seus dados locais
cp application.properties.example src/main/resources/application.properties

# 4. Compile e instale as dependências
mvn clean install

# 5. Execute a aplicação
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

Documentação Swagger: `http://localhost:8080/swagger-ui.html`

---

## 🗄 Banco de Dados

O banco de dados é gerenciado pelo **SQL Server** com autenticação do Windows. A tabela principal é `Veiculos`, com os campos: `marca`, `modelo`, `ano`, `cor`, `placa`, `chassi`, `km_rodados`, `preco`, `situacao` e `descricao`.

> ⚠️ O arquivo `application.properties` não é versionado. Use o `application.properties.example` como base para configurar sua conexão local.

---

## 🌐 Frontend

O front-end da aplicação está disponível em repositório separado e consome esta API via chamadas HTTP.

> 🔗 **Repositório do Frontend:** *(adicione o link aqui)*

---

## 👨‍💻 Autor

**Pedro Henrique Lima**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-phrosa-0A66C2?style=flat&logo=linkedin)](https://linkedin.com/in/phrosa)

---

> Projeto desenvolvido para fins de aprendizado e portfólio. 🚀

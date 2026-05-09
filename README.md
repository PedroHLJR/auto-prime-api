# 🚗 Auto Prime API

> API RESTful para a loja fictícia de carros **Auto Prime**, desenvolvida com Java e Spring Boot.

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Tecnologias](#-tecnologias)
- [Estrutura Sugerida da API](#-estrutura-sugerida-da-api)
- [Endpoints](#-endpoints)
- [Como Executar](#-como-executar)
- [Variáveis de Ambiente](#-variáveis-de-ambiente)
- [Banco de Dados](#-banco-de-dados)
- [Frontend](#-frontend)
- [Autor](#-autor)

---

## 📌 Sobre o Projeto

A **Auto Prime API** é uma aplicação back-end que fornece serviços para uma loja fictícia de automóveis. Ela gerencia o catálogo de veículos, clientes e pedidos de compra, expondo endpoints REST consumidos pelo front-end da aplicação.

---

## 🛠 Tecnologias

| Camada       | Tecnologia                          |
|--------------|--------------------------------------|
| Linguagem    | Java 25                             |
| Framework    | Spring Boot 4                      |
| Banco de Dados | MySQL                |
| Build        | Maven                                |
| Testes       | JUnit 5      |

---

## 🗂 Estrutura Sugerida da API

```
auto-prime-api/
├── src/
│   └── main/
│       ├── java/com/autoprime/api/
│       │   ├── controller/         # Camada de entrada (REST Controllers)
│       │   │   ├── CarroController.java
│       │   │   ├── MarcaController.java
│       │   │   ├── ClienteController.java
│       │   │   └── PedidoController.java
│       │   │
│       │   ├── service/            # Regras de negócio
│       │   │   ├── CarroService.java
│       │   │   ├── MarcaService.java
│       │   │   ├── ClienteService.java
│       │   │   └── PedidoService.java
│       │   │
│       │   ├── repository/         # Comunicação com o banco (JPA)
│       │   │   ├── CarroRepository.java
│       │   │   ├── MarcaRepository.java
│       │   │   ├── ClienteRepository.java
│       │   │   └── PedidoRepository.java
│       │   │
│       │   ├── model/              # Entidades JPA
│       │   │   ├── Carro.java
│       │   │   ├── Marca.java
│       │   │   ├── Cliente.java
│       │   │   └── Pedido.java
│       │   │
│       │   ├── dto/                # Objetos de transferência de dados
│       │   │   ├── CarroDTO.java
│       │   │   ├── ClienteDTO.java
│       │   │   └── PedidoDTO.java
│       │   │
│       │   ├── exception/          # Tratamento de erros globais
│       │   │   ├── GlobalExceptionHandler.java
│       │   │   └── ResourceNotFoundException.java
│       │   │
│       │   └── AutoPrimeApiApplication.java
│       │
│       └── resources/
│           ├── application.properties
│           └── application-dev.properties
│
└── pom.xml
```

---

## 📡 Endpoints

### 🚘 Carros — `/api/carros`

| Método | Rota              | Descrição                        |
|--------|-------------------|----------------------------------|
| GET    | `/api/carros`     | Lista todos os carros            |
| GET    | `/api/carros/{id}`| Busca um carro por ID            |
| POST   | `/api/carros`     | Cadastra um novo carro           |
| PUT    | `/api/carros/{id}`| Atualiza dados de um carro       |
| DELETE | `/api/carros/{id}`| Remove um carro                  |

**Exemplo de body (POST/PUT):**
```json
{
  "modelo": "Civic",
  "ano": 2023,
  "preco": 145000.00,
  "cor": "Prata",
  "quilometragem": 0,
  "disponivel": true,
  "marcaId": 1
}
```

---

### 🏷 Marcas — `/api/marcas`

| Método | Rota               | Descrição                   |
|--------|--------------------|-----------------------------|
| GET    | `/api/marcas`      | Lista todas as marcas        |
| GET    | `/api/marcas/{id}` | Busca uma marca por ID       |
| POST   | `/api/marcas`      | Cadastra uma nova marca      |
| PUT    | `/api/marcas/{id}` | Atualiza dados de uma marca  |
| DELETE | `/api/marcas/{id}` | Remove uma marca             |

**Exemplo de body (POST/PUT):**
```json
{
  "nome": "Honda",
  "paisOrigem": "Japão"
}
```

---

### 👤 Clientes — `/api/clientes`

| Método | Rota                 | Descrição                     |
|--------|----------------------|-------------------------------|
| GET    | `/api/clientes`      | Lista todos os clientes        |
| GET    | `/api/clientes/{id}` | Busca um cliente por ID        |
| POST   | `/api/clientes`      | Cadastra um novo cliente       |
| PUT    | `/api/clientes/{id}` | Atualiza dados de um cliente   |
| DELETE | `/api/clientes/{id}` | Remove um cliente              |

**Exemplo de body (POST/PUT):**
```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "32999998888",
  "cpf": "123.456.789-00"
}
```

---

### 🛒 Pedidos — `/api/pedidos`

| Método | Rota                 | Descrição                     |
|--------|----------------------|-------------------------------|
| GET    | `/api/pedidos`       | Lista todos os pedidos         |
| GET    | `/api/pedidos/{id}`  | Busca um pedido por ID         |
| POST   | `/api/pedidos`       | Cria um novo pedido            |
| PUT    | `/api/pedidos/{id}`  | Atualiza status de um pedido   |
| DELETE | `/api/pedidos/{id}`  | Cancela um pedido              |

**Exemplo de body (POST):**
```json
{
  "clienteId": 1,
  "carroId": 3,
  "formaPagamento": "FINANCIAMENTO",
  "status": "PENDENTE"
}
```

---

## 👨‍💻 Autor

**Pedro Henrique Lima**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-phrosa-0A66C2?style=flat&logo=linkedin)](https://linkedin.com/in/phrosa)

---

> Projeto desenvolvido para fins de aprendizado e portfólio. 🚀
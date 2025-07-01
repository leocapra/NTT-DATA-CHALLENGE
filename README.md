# Desafio Técnico - Microserviços com Spring Boot e Spring Cloud

Olá! Meu nome é Leonardo e este repositório contém a solução do desafio técnico do bootcamp da NTT DATA.

---

## Objetivo do desafio

Desenvolver uma aplicação baseada em microserviços utilizando Spring Boot e Spring Cloud, aplicando os conceitos de arquitetura moderna com:

- Service Discovery (Eureka)
- API Gateway (Spring Cloud Gateway)
- Comunicação entre serviços
- Persistência de dados com banco H2
- Boas práticas REST
- Autenticação simplificada via token fixo no header Authorization (Bearer token)

O sistema consiste em:

- **Microserviço 1:** Gestão de produtos (CRUD com nome, descrição e preço) com persistência em banco H2
- **Microserviço 2:** Simulação de pedidos que consome o microserviço de produtos e cria pedidos baseados em lista de produtos (sem persistência)

Todos os endpoints estão acessíveis via API Gateway nas rotas `/produtos` e `/pedidos`.

---

## Ambiente e ferramentas usadas

- Java 17+
- Spring Boot / Spring Cloud (Eureka, Gateway)
- H2 Database (in-memory)
- Spring Security (autenticação via token fixo)
- IDE: VSCode  
  ![VSCode](./imagens/vscode.png) <!-- substitua pelo caminho correto da imagem -->
- Cliente HTTP: Insomnia  
  ![Insomnia](./imagens/insomnia.png) <!-- substitua pelo caminho correto da imagem -->

---

## Como testar o projeto

1. Clone o repositório e importe os projetos no seu IDE favorito.
2. Certifique-se de ter Java instalado (versão 17 ou superior).
3. Execute o servidor Eureka (service discovery).
4. Execute os microserviços de produtos e pedidos (cada um em sua porta configurada).
5. Execute o API Gateway (porta configurada para 8700+).
6. No Insomnia ou outra ferramenta de requisição HTTP, configure as chamadas para a API Gateway:

- Exemplo para listar produtos:

```
GET http://localhost:8700/produtos
Headers:
Authorization: Bearer <token_fixo>
```

- Exemplo para criar pedido:

```
POST http://localhost:8700/pedidos
Headers:
Authorization: Bearer <token_fixo>
Body (JSON):
{
  "produtos": [
    {"id": 1, "quantidade": 2},
    {"id": 3, "quantidade": 1}
  ]
}
```

7. Teste os endpoints respeitando o token fixo na autenticação para garantir acesso autorizado.

---

Qualquer dúvida, fique à vontade para entrar em contato!

---

Leonardo  
NTT DATA Bootcamp  

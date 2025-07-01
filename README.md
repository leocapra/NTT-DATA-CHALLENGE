
# DESAFIO NNT-DATA (BOOTCAMP DIO) JAVA COM SPRINGBOOT E SPRING CLOUD (MICROSERVIÇOS)

Esta API é composta por dois microserviços e um API Gateway, rodando nos seguintes serviços e portas:

- Microserviço Produtos: http://localhost:8100/produtos  
- Microserviço Pedidos: http://localhost:8200/pedidos  
- API Gateway: encaminha chamadas para os microserviços acima (porta 8700)

---

## Endpoints Microserviço Produtos

### ✅ Listar todos os produtos  
- Método: `GET`  
- URL: `http://localhost:8100/produtos`  

### ✅ Cadastrar um produto  
- Método: `POST`  
- URL: `http://localhost:8100/produtos`  
- Body (JSON):

```json
{
  "nome": "Notebook Gamer",
  "descricao": "RTX 4060, i7 13ª geração",
  "preco": 8999.90
}
```

### ✅ Buscar produto por ID  
- Método: `GET`  
- URL: `http://localhost:8100/produtos/{id}`  
- Exemplo: `http://localhost:8100/produtos/1`

### ✅ Atualizar produto  
- Método: `PUT`  
- URL: `http://localhost:8100/produtos/{id}`  
- Body (JSON):

```json
{
  "nome": "Notebook Atualizado",
  "descricao": "Nova descrição",
  "preco": 7999.90
}
```

### ✅ Deletar produto  
- Método: `DELETE`  
- URL: `http://localhost:8100/produtos/{id}`  
- Exemplo: `http://localhost:8100/produtos/1`

---

## Endpoints Microserviço Pedidos

### ✅ Buscar pedido por ID  
- Método: `GET`  
- URL: `http://localhost:8200/pedidos/{id}`  
- Exemplo: `http://localhost:8200/pedidos/1`  

- Exemplo de resposta:

```json
{
  "id": 1,
  "produtos": [
    {
      "id": 1,
      "nome": "Notebook Gamer",
      "descricao": "RTX 4060, i7 13ª geração",
      "preco": 8999.9
    }
  ]
}
```

### ✅ Simular criação de pedido  
- Método: `POST`  
- URL: `http://localhost:8200/pedidos`  
- Body (JSON):

```json
[
  {
    "id": 1,
    "nome": "Notebook Gamer",
    "descricao": "RTX 4060, i7 13ª geração",
    "preco": 8999.90
  }
]
```

---

## Como testar via API Gateway

Para garantir que a API Gateway está funcionando e roteando corretamente, você pode acessar os mesmos endpoints através da porta 8700, adicionando o prefixo `/produtos` ou `/pedidos`.

Por exemplo:

- Listar produtos via gateway:  
  `GET http://localhost:8700/produtos`  

- Buscar pedido por ID via gateway:  
  `GET http://localhost:8700/pedidos/1`  

Lembre-se que o header `Authorization` com o token fixo deve ser enviado em todas as requisições para passar pela autenticação do gateway:

```
Authorization: Bearer meu-token-fixo-123
```

---

## Observações

- A autenticação do token é feita pelo API Gateway.  
- Os microserviços não possuem autenticação própria.  
- O microserviço Produtos usa banco H2 para persistência.  
- O microserviço Pedidos não persiste dados, apenas simula pedidos baseados nos produtos.  

---

## Sugestões para rodar

1. Inicie o servidor Eureka (service discovery).  
2. Inicie os microserviços Produtos (porta 8100) e Pedidos (porta 8200).  
3. Inicie o API Gateway (porta 8700).  
4. Faça requisições ao gateway para testar a API.  

---

## Considerações finais

Esta API foi desenvolvida usando **Inteligência Artificial de maneira correta!**  
O Bootcamp ensinou a desenvolver habilidades úteis com as ferramentas de IA, muita gente não sabe usar, usando de maneira correta e com moderação, entendendo de fato o que está fazendo, o que está dando errado e onde está o problema para solucionar é muito mais importante do que apenas lançar prompts aleatoriamente no chat.

Todo esse projeto foi desenvolvido usando o **VSCode**, **Spring Initializr**, **GitHub Copilot**, **WSL (Windows Subsystem for Linux)**.  
Além de me fazer entender vários conceitos e bases que antes não tinha entendido, esse repositório também tem o intuito de mostrar que nenhuma ferramenta é pior ou melhor que outra. Eu gosto de desenvolver usando o VSCode, por mais que possa parecer um desafio com o Java, muita gente despreza a ferramenta pois ela não oferece tanto suporte nativamente, porém ela tem suas vantagens, e eu gosto dela.  
O mesmo usando o ambiente de desenvolvimento Linux, pelo WSL que para iniciantes é um grande desafio também, mas ainda conta com suporte de git dentre outras ferramentas e CLI dentro da plataforma, o que deixa o ambiente mais profissional.

Gostaria de agradecer ao pessoal da **DIO** que me deu a oportunidade de aprender e aprofundar ainda mais meu conhecimento com programação.  
Esse foi um dos meus primeiros contatos com Java e esse meu primeiro projeto onde eu vejo um contexto real, onde tive que desafiar o **DEBUG**, desafiar as consultas às documentações, usei IAs como professor para uso didático, consegui utilizar uma ferramenta que usava em minha experiência com Node, o Insomnia, e esse bootcamp me provou que o **Java não é bicho de sete cabeças**, pelo contrário, ele é mais simples que o Node, no Node usamos muitas bibliotecas e gambiarras para fazer funcionar um POO.  

Enfim, agradeço a **NTT-DATA** também. Mesmo se eu não for convidado pelo processo seletivo para fazer parte dessa grande empresa, eu continuarei me dedicando e me esforçando para aprender mais, e quando chegar minha hora de ingressar numa empresa boa, estarei cada vez mais preparado, mas conformado que nunca estarei no 100%, estarei sempre buscando crescimento.  

Esse bootcamp foi um degrau que me deixou pensativo, reflexivo, que mesmo tendo didáticas com professores que muitas vezes não são muito claros, mostra que devemos sempre superar qualquer desafio.

---

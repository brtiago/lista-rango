<div id="top"></div>
<h1 align="center">
  Lista Rango
</h1>

![Logo](src/main/resources/assets/be43294e-4b68-43b0-9f03-d4221f293c45.webp)

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=@tgribeiro&color=8257E5&labelColor=000000" alt="@tgribeiro" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

## 💻 Sobre o projeto
Projeto final para conclusão do bootcamp [Desenvolvimento Java com IA](https://web.dio.me/track/coding-future-gft-desenvolvimento-java-com-ia) do site [DIO](https://www.dio.me/).

## 🎯 Objetivos
Criar uma API RESTful capaz de gerenciar restaurantes e os produtos do seu cardápio.

## ⚙️ Funcionalidades desejadas:
#### Restaurantes
- [ ] Listar restaurantes
- [ ] Cadastrar restaurantes
- [ ] Listar dados de um restaurante
- [ ] Alterar dados um restaurante
- [ ] Excluir um restaurante
##### Produtos:
- [ ] Listar todos os produtos de um restautante
- [ ] Criar um produto de um restaurante
- [ ] Alterar um produto de um restaurante
- [ ] Excluir um produto de um restaurante

#### O cadastro do restaurante precisa ter os seguintes campos:
- [x] Foto do restaurante
- [x] Nome do restaurante
- [x] Endereço do restaurante
- [x] Horários de funcionamento do restaurante (ex.: De Segunda à Sexta das 09h as 18h e de Sabado à Domingo das 11h as 20h).

#### O cadastro de produtos do restaurante precisa ter os seguintes campos:
- [x] Foto do produto
- [x] Nome do produto
- [x] Preço do produto
- [x] Categoria do produto (ex.: Doce, Salgados, Sucos...)

#### Quando o Produto for colocado em promoção, precisa ter os seguintes campos:
- [x] Descrição para a promoção do produto (ex.: Chopp pela metade do preço)
- [x] Preço promocional
- [ ] Dias da semana e o horário em que o produto deve estar em promoção

#### Formato de horários
- [ ] É necessário tratar os campos que indicam horários de funcionamento e horário para as promoções dos produtos.
- [ ] Os campos devem possuir o formato HH:mm.
- [ ] Os horários devem possuir intervalo mínimo de 15 minutos.


<p align="right">(<a href="#top">back to top</a>)</p>

#### Um Restaurante deve ter os seguintes campos:
```json
{
  "id": "0001",
  "foto": "restaurante.jpg",
  "nome": "Restaurante Marazul",
  "endereco": "Av. João Candido, 31, Cidade Nova",
  "funcionamento": [
    {
      "diainicial": "segunda",
      "diafinal": "sexta",
      "horainicial": "09:00",
      "horafinal": "20:00"
    }
  ],
  "produtos": [
    {
      "id": "0012",
      "foto": "canjica.jpeg",
      "nome": "Canjica",
      "quantidade": 20,
      "preco": 20.00,
      "categoria": "SOBREMESAS",
      "promocao": {
        "ativa": true,
        "id": "005",
        "descricao": "Canjica pela metade do preço",
        "preco": 10.00,
        "periodo": [
          {
            "diainicial": "segunda",
            "diafinal": "sexta",
            "horainicial": "09:00",
            "horafinal": "20:00"
          }
        ]
      }
    }
  ]
}
```

<p align="right">(<a href="#top">back to top</a>)</p>

## Especificações
A URL da requisição deve ter o seguinte formato:

```java
    http://localhost:8080/api/v1/restaurants/{id}/
    http://localhost:8080/api/v1/restaurants/{id}/products/{productid}
```

A resposta deve ter o seguinte formato: **Ainda sendo implementado**

<p align="right">(<a href="#top">back to top</a>)</p>

## Diagrama UML da API

```mermaid
classDiagram
    class Restaurante {
        -Long id
        -BufferedImage foto
        -String nome
        -String endereco
    }
    class Funcionamento {
        -LocalDateTime diainicial
        -LocalDateTime diafinal
        -LocalDateTime horainicial
        -LocalDateTime horafinal
    }
    class Produto {
        -Long id
        -BufferedImage foto
        -String nome
        -int quantidade
        -BigDecimal preco
        -CategoriaProduto categoria
    }
    class Promocao {
        -boolean ativa
        -Long id
        -String descricao
        -float preco
    }
    class Periodo {
        -String diainicial
        -String diafinal
        -String horainicial
        -String horafinal
    }

    Restaurante "1" --> "0..*" Funcionamento : tem
    Restaurante "1" --> "0..*" Produto : tem
    Produto "1" --> "0..1" Promocao : pode ter
    Promocao "1" --> "0..*" Periodo : tem
  ```

<p align="right">(<a href="#top">back to top</a>)</p>

## 🛠 Tecnologias utilizadas
* Spring Boot 3
* Java 17
* Lombok
* PostgreSQL/ Flyway
* JPA/Hibernate
* Maven
* Insomnia
* Docker

<p align="right">(<a href="#top">back to top</a>)</p>
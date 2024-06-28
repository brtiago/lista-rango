# lista-rango
Criar uma API RESTful capaz de gerenciar os restaurantes e os produtos do seu cardápio.
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

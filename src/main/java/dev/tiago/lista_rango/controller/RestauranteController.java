package dev.tiago.lista_rango.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/restaurante")
@Tag(name = "restaurante", description = "Gerenciamento de restaurantes")
public class RestauranteController {

    @Operation(summary = "Exibe uma lista de restaurantes")
    @GetMapping
    public void listarRestaurantes() {
        System.out.println("lista");
    }

    @Operation(summary = "Exibir restaurante pelo ID")
    @GetMapping("{restauranteId}")
    public void listarRestaurantPorId() {
        System.out.println("lista restaurante");
    }

    @Operation(summary = "Atualizar restaurante")
    @PutMapping("/{restauranteId}")
    public void atualizarRestaurantPorId() {
        System.out.println("Editar restaurante");
    }

    @Operation(summary = "Cadastra um novo restaurante")
    @PostMapping
    public void cadastrarRestaurantes() {
        System.out.println("cadastrar");
    }

    @Operation(summary = "Exclui restaurante")
    @DeleteMapping("/{restauranteId}")
    public void excluirRestaurante() {
        System.out.println("resutaurante removido");
    }

    @Operation(summary = "Listar produtos de um restaurante")
    @GetMapping("/{restauranteId}/produto")
    public void listarProdutoRestaurante() {
        System.out.println("lista produtos restaurante");
    }

    @Operation(summary = "Cadastra novo produto de um restaurante")
    @PostMapping("/{restauranteId}/produto")
    public void cadastrarProdutoRestaurante() {
        System.out.println("cadastrar");
    }

    @Operation(summary = "Atualizar produto restaurante")
    @PutMapping("/{restauranteId}/{produtoId}")
    public void atualizarProdutoRestaurantPorId() {
        System.out.println("Editar produto restaurante");
    }

    @Operation(summary = "Exclui produto de um restaurante")
    @DeleteMapping("/{restauranteId}/{produtoId}")
    public void excluirProdutoRestaurante() {
        System.out.println("Produto resutaurante removido");
    }

    @Operation(summary = "Listar produto de um restaurante pelo seu id")
    @GetMapping("/{restauranteId}/{produtoId}")
    public void listarProdutoPorIdRestaurante() {
        System.out.println("lista produtos restaurante");
    }


}

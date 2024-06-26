package dev.tiago.lista_rango.controller;

import dev.tiago.lista_rango.model.Restaurante;
import dev.tiago.lista_rango.service.impl.RestauranteServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/restaurantes")
@Tag(name = "restaurantes", description = "Gerenciamento de restaurantes")
public class RestauranteController {

    private RestauranteServiceImpl service;

    public RestauranteController(RestauranteServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Exibe uma lista de restaurantes")
    @GetMapping
    public ResponseEntity<Iterable<Restaurante>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @Operation(summary = "Exibir restaurante pelo ID")
    @GetMapping("/{restauranteId}")
    public void getRestaurantById(@PathVariable("id") Long id) {
        // FIXME Buscar Restaurante por id.
    }

    @Operation(summary = "Atualizar restaurante")
    @PutMapping("/{restauranteId}")
    public void atualizarRestaurantPorId() {
        // FIXME atualizar restaurante por id
    }

    @Operation(summary = "Cadastra um novo restaurante")
    @PostMapping
    public void cadastrarRestaurantes() {
        // FIXME Cadastrar novo Restaurante.
    }

    @Operation(summary = "Exclui restaurante")
    @DeleteMapping("/{restauranteId}")
    public void excluirRestaurante() {
        // FIXME Remover Restaurante.
    }

    @Operation(summary = "Listar produtos de um restaurante")
    @GetMapping("/{restauranteId}/produto")
    public void listarProdutoRestaurante() {
        // FIXME Listar Produtos de um Restaurante.
    }

    @Operation(summary = "Cadastra novo produto de um restaurante")
    @PostMapping("/{restauranteId}/produto")
    public void cadastrarProdutoRestaurante() {
        // FIXME Cadastrar produto em um restaurante.
    }

    @Operation(summary = "Atualizar produto restaurante")
    @PutMapping("/{restauranteId}/{produtoId}")
    public void atualizarProdutoRestaurantPorId() {
        // FIXME Atualizar produto de um Restaurante.
    }

    @Operation(summary = "Exclui produto de um restaurante")
    @DeleteMapping("/{restauranteId}/{produtoId}")
    public void excluirProdutoRestaurante() {
        // FIXME Excluir produto de um Restaurante.
    }

    @Operation(summary = "Listar produto de um restaurante pelo seu id")
    @GetMapping("/{restauranteId}/{produtoId}")
    public void listarProdutoPorIdRestaurante() {
        // FIXME Listar produto com um id especifico de um restaurante
    }


}

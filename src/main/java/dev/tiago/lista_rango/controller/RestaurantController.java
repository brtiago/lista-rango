package dev.tiago.lista_rango.controller;

import dev.tiago.lista_rango.controller.dto.CreateRestaurantDto;
import dev.tiago.lista_rango.controller.dto.RestaurantDto;
import dev.tiago.lista_rango.model.Restaurant;
import dev.tiago.lista_rango.service.impl.RestaurantServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/restaurants")
@Tag(name = "Restaurants Controller", description = "Restful API for managing restaurants.")
public record RestaurantController(RestaurantServiceImpl restaurantService) {

    @GetMapping
    @Operation(summary = "Get all restaurants", description = "Retrieve a list of all registered restaurants")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful")
    })
    public ResponseEntity<List<RestaurantDto>> findAll() {
        var restaurants = restaurantService.findAll();
        var restaurantsDto = restaurants.stream().map(RestaurantDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(restaurantsDto);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Get a restaurant by ID", description = "Retrieve a specific restaurant based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "404", description = "Restaurant not found")
    })
    public ResponseEntity<RestaurantDto> findById(@PathVariable Long id) {
        var restaurant = restaurantService.findById(id);
        return ResponseEntity.ok(new RestaurantDto(restaurant));
    }


    @PutMapping("/{id}")
    @Operation(summary = "Update a restaurant", description = "Update the data of an existing user based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Restaurant updated successfully"),
            @ApiResponse(responseCode = "404", description = "Restaurant not found"),
            @ApiResponse(responseCode = "422", description = "Invalid restaurant data provided")
    })
    public ResponseEntity<RestaurantDto> update(@PathVariable Long id, @RequestBody RestaurantDto restaurantDto) {
        var restaurant = restaurantService.update(id, restaurantDto.toModel());
        return ResponseEntity.ok(new RestaurantDto(restaurant));
    }


    @PostMapping
    @Operation(summary = "Create a new restaurant", description = "Create a new restaurant and return the created data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Restaurant created successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid restaurant data provided")
    })
    public ResponseEntity<RestaurantDto> create(@RequestBody RestaurantDto restaurantDto) {
        var restaurant = restaurantService.create(restaurantDto.toModel());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id")
                .buildAndExpand(restaurant.getId())
                .toUri();
        return ResponseEntity.created(location).body(new RestaurantDto(restaurant));
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a restaurant", description = "Delete an existing restaurant based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Restaurant deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Restaurant not found")
    })
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        restaurantService.delete(id);
        return ResponseEntity.noContent().build();
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

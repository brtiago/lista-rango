package dev.tiago.lista_rango.controller;

import dev.tiago.lista_rango.controller.dto.ProductDto;
import dev.tiago.lista_rango.controller.dto.RestaurantDto;
import dev.tiago.lista_rango.service.impl.ProductServiceImpl;
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
public record RestaurantController(RestaurantServiceImpl restaurantService, ProductServiceImpl productService) {

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
    @Operation(summary = "Update a restaurant", description = "Update the data of an existing restaurant based on its ID")
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


    @GetMapping("/{id}/product")
    @Operation(summary = "Get all products", description = "Retrieve a list of all registered products from a restaurant")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful")
    })
    public ResponseEntity<List<ProductDto>> findAllProducts() {
        var products = productService.findAll();
        var productsDto = products.stream().map(ProductDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(productsDto);
    }


    @PostMapping("/{id}/product")
    @Operation(summary = "Create a new restaurant", description = "Create a new restaurant and return the created data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Restaurant created successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid restaurant data provided")
    })
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        var product = productService.create(productDto.toModel());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id")
                .buildAndExpand(product.getId())
                .toUri();
        return ResponseEntity.created(location).body(new ProductDto(product));
    }

    @PutMapping("/{id}/{productId}")
    @Operation(summary = "Update a product", description = "Update the data of an existing product based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product updated successfully"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "422", description = "Invalid product data provided")
    })
    public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        var product = productService.update(id, productDto.toModel());
        return ResponseEntity.ok(new ProductDto(product));
    }


    @DeleteMapping("/{id}/{productId}")
    @Operation(summary = "Delete a product", description = "Delete an existing product based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Product deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}/{productId}")
    @Operation(summary = "Get a product by ID", description = "Retrieve a specific product based on its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    public ResponseEntity<ProductDto> findProductById(@PathVariable Long id) {
        var product = productService.findById(id);
        return ResponseEntity.ok(new ProductDto(product));
    }

}

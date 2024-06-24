package dev.tiago.lista_rango.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {

    @GetMapping("/")
    public void listarRestaurantes() {
        System.out.println("lista");
    }


}

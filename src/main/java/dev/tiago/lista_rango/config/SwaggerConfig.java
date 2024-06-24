package dev.tiago.lista_rango.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Lista Rango API",
                version = "0.1",
                description = "API para gerenciar os restaurantes e os produtos do seu cardápio.",
                contact = @Contact(
                        name = "Tiago R.",
                        email = "tgribeiro@gmail.com"
                )
        )
)
public class SwaggerConfig {
}

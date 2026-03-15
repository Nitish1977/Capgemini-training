package com.bookmydoctor.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import io.swagger.v3.oas.models.security.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("BookMyDoctor API")
                        .description(
                            "## How to use Swagger UI\n\n" +
                            "**Step 1:** Register an Admin → `POST /api/auth/register/admin`\n\n" +
                            "**Step 2:** Register a User → `POST /api/auth/register`\n\n" +
                            "**Step 3:** Login → `POST /api/auth/login` → copy the `token` value from response\n\n" +
                            "**Step 4:** Click the **Authorize 🔓** button at the top of this page\n\n" +
                            "**Step 5:** In the value field type: `Bearer ` then paste your token (e.g. `Bearer eyJhbGci...`)\n\n" +
                            "**Step 6:** Click Authorize → Close → now all secured APIs will use your token"
                        )
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("BookMyDoctor")
                                .email("admin@bookmydoctor.com")))
                .addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
                .components(new Components()
                        .addSecuritySchemes("Bearer Authentication",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description("Paste your JWT token here (without the word 'Bearer')")));
    }
}

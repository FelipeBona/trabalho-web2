/* 
package furb.trabalhoweb2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// A anotação @Configuration indica que esta classe contém configurações do Spring.
@Configuration
// A anotação @EnableSwagger2 habilita o Swagger para a geração da documentação da API.
@EnableSwagger2
public class SwaggerConfig {
    // O método api() define um bean do tipo Docket, que é usado para configurar o Swagger.
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select() // Inicia um builder para a seleção das APIs a serem documentadas.
            .apis(RequestHandlerSelectors.basePackage("com.example.demo")) // Define o pacote base para a busca dos controladores a serem documentados pelo Swagger.
            .paths(PathSelectors.any()) // Define que todas as URLs serão documentadas.
            .build(); // Constrói o Docket com as configurações definidas.
    }
}
*/

//Este código (comentado) configura o Swagger para a documentação da API em uma aplicação Spring Boot. A classe SwaggerConfig é anotada com @Configuration e @EnableSwagger2 para definir as configurações necessárias para habilitar o Swagger. 
//O método api() define um bean do tipo Docket, 
//que configura o Swagger para documentar as APIs encontradas no pacote base "com.example.demo" e todas as suas URLs.
//Para ativar esta configuração, basta descomentar o código removendo os /* e */ no início e no final.
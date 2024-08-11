package furb.trabalhoweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// A anotação @SpringBootApplication combina três anotações importantes:
// @Configuration: Indica que a classe é uma fonte de definições de beans do Spring.
// @EnableAutoConfiguration: Habilita a configuração automática do Spring Boot.
// @ComponentScan: Habilita a varredura de componentes no pacote base.
@SpringBootApplication
public class Trabalhoweb2Application {

    // O método main é o ponto de entrada da aplicação Spring Boot.
    public static void main(String[] args) {
        // SpringApplication.run() lança a aplicação, inicializando o contexto Spring e a configuração automática.
        SpringApplication.run(Trabalhoweb2Application.class, args);
    }

}


//Este código define a classe principal Trabalhoweb2Application para uma aplicação Spring Boot. 
//A anotação @SpringBootApplication configura a aplicação, habilitando a configuração automática, 
//a varredura de componentes e a definição de beans. O método main é o ponto de entrada da aplicação, 
//onde SpringApplication.run() é chamado para iniciar a aplicação.
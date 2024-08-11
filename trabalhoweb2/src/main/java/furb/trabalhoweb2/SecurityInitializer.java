package furb.trabalhoweb2;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

// A anotação @Configuration indica que esta classe é uma classe de configuração do Spring.
@Configuration
// A anotação @Order define a ordem de inicialização desta configuração. Aqui, ela é inicializada com alta prioridade (valor 1).
@Order(1)
// A classe SecurityInitializer estende AbstractSecurityWebApplicationInitializer, que é uma classe base para registrar 
// o filtro de segurança Spring (DelegatingFilterProxy) no contêiner de servlet.
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    // Esta classe não precisa de métodos adicionais.
    // A extensão de AbstractSecurityWebApplicationInitializer é suficiente para ativar a configuração de segurança da aplicação.
}


//Este código define uma classe SecurityInitializer que estende AbstractSecurityWebApplicationInitializer. 
//A anotação @Configuration indica que esta classe contém configurações Spring, 
//e @Order(1) garante que esta configuração seja carregada com alta prioridade. 
//Estendendo AbstractSecurityWebApplicationInitializer, esta classe registra automaticamente o filtro de segurança do Spring no contêiner de servlet da aplicação, 
//ativando as configurações de segurança definidas no projeto.
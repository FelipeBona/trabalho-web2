package furb.trabalhoweb2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

// A anotação @Configuration indica que esta classe contém configurações do Spring.
@Configuration
// A anotação @EnableWebSecurity ativa a segurança da web no projeto Spring.
@EnableWebSecurity
public class SecurityConfig {

    // Definição de um bean do tipo SecurityFilterChain, que configura a segurança HTTP.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Configura as regras de autorização de requisições HTTP.
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                // Permite acesso público às URLs do Swagger UI e da documentação da API.
                                .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                                // Requer autenticação para qualquer outra requisição.
                                .anyRequest().authenticated()
                )
                // Habilita a autenticação básica HTTP.
                .httpBasic(withDefaults())
                // Desabilita a proteção CSRF (Cross-Site Request Forgery) para facilitar o uso com ferramentas como Postman/Insomnia.
                .csrf(csrf -> csrf.disable());

        // Retorna a configuração de segurança construída.
        return http.build();
    }

    // Definição de um bean do tipo UserDetailsService, que fornece os detalhes do usuário para autenticação.
    @Bean
    public UserDetailsService userDetailsService() {
        @SuppressWarnings("deprecation")
        // Cria um usuário em memória com username "user", password "password", e role "USER".
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("user")
            .password("password")
            .roles("USER")
            .build();

        // Retorna um gerenciador de usuários em memória com o usuário criado.
        return new InMemoryUserDetailsManager(user);
    }
}

//Este código configura a segurança da aplicação Spring Boot. 
//A classe SecurityConfig é anotada com @Configuration e @EnableWebSecurity para definir as configurações de segurança da web. 
//O método securityFilterChain(HttpSecurity http) configura as permissões de acesso, 
//permitindo acesso público às URLs do Swagger e exigindo autenticação para outras requisições. 
//Ele também desabilita a proteção CSRF e habilita a autenticação básica HTTP. 
//O método userDetailsService() cria um usuário em memória com username "user" e password "password" para fins de autenticação.

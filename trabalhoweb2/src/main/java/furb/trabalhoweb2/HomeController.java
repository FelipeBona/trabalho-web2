package furb.trabalhoweb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// A anotação @Controller indica que esta classe é um controlador Spring MVC.
@Controller
public class HomeController {

    // A anotação @GetMapping é usada para mapear requisições HTTP GET para o método home().
    @GetMapping("/")
    public String home() {
        // Este método redireciona a raiz ("/") da aplicação para a página do Swagger UI.
        return "redirect:/swagger-ui/index.html";
    }
}

//Este código define um controlador Spring MVC chamado HomeController. 
//Quando a raiz da aplicação ("/") é acessada via uma requisição HTTP GET, o método home() é invocado, 
//redirecionando o usuário para a interface do Swagger UI localizada em /swagger-ui/index.html. 
//A anotação @Controller indica que esta classe lida com requisições web, 
//e @GetMapping("/") mapeia a URL raiz para o método home()
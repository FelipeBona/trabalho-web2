package furb.trabalhoweb2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // Injeção de dependência do UsuarioRepository para acessar os dados de usuários no banco.
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Endpoint para buscar todos os usuários.
    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return ResponseEntity.ok().body(usuarios);
    }

    // Endpoint para buscar um usuário por ID.
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        java.util.Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return ResponseEntity.ok().body(usuario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint para criar um novo usuário.
    @PostMapping("/")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario createdUsuario = usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsuario);
    }

    // Endpoint para atualizar um usuário existente por ID.
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        java.util.Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.setNome(usuarioDetails.getNome());
            usuario.setEmail(usuarioDetails.getEmail());
            usuarioRepository.save(usuario);
            return ResponseEntity.ok().body(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint para deletar um usuário por ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable Long id) {
        try {
            usuarioRepository.deleteById(id);
            return ResponseEntity.ok().body(new CustomResponse("OK", "Usuário deletado com sucesso"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new CustomResponse("ERRO", e.getMessage()));
        }
    }
}

/*Injeção de Dependência (@Autowired):

private UsuarioRepository usuarioRepository;
A anotação @Autowired injeta automaticamente uma instância de UsuarioRepository, que é usada para acessar os dados dos usuários no banco de dados.
Endpoints REST:

GET /usuarios/:
getAllUsuarios(): Retorna todos os usuários cadastrados.
GET /usuarios/{id}:
getUsuarioById(@PathVariable Long id): Retorna um usuário específico pelo ID.
POST /usuarios/:
createUsuario(@RequestBody Usuario usuario): Cria um novo usuário com base nos dados fornecidos no corpo da requisição.
PUT /usuarios/{id}:
updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails): Atualiza os dados de um usuário existente com base no ID fornecido.
DELETE /usuarios/{id}:
deleteUsuario(@PathVariable Long id): Deleta um usuário pelo ID.
Respostas HTTP (ResponseEntity):

ResponseEntity é usado para retornar respostas HTTP com status e corpo personalizados.
ResponseEntity.ok().body(objeto) retorna uma resposta com status 200 OK e o corpo especificado.
ResponseEntity.notFound().build() retorna uma resposta com status 404 Not Found quando um usuário não é encontrado.
ResponseEntity.status(HttpStatus.CREATED).body(objeto) retorna uma resposta com status 201 Created ao criar um novo usuário.
ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(objeto) retorna uma resposta com status 500 Internal Server Error em caso de erro durante a exclusão do usuário.
Mapeamento de Requisições (@GetMapping, @PostMapping, @PutMapping, @DeleteMapping):

Estas anotações mapeiam os métodos HTTP GET, POST, PUT e DELETE para os métodos correspondentes no controlador UsuarioController.
Classe CustomResponse:

É utilizada para encapsular respostas personalizadas, como no método deleteUsuario() para retornar mensagens de status personalizadas.
Este controlador UsuarioController implementa operações CRUD (Create, Read, Update, Delete) básicas para a entidade Usuario, utilizando o padrão RESTful e integrando com um repositório Spring Data JPA (UsuarioRepository) para persistência de dados.
*/
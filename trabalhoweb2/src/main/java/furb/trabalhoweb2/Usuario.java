package furb.trabalhoweb2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// A anotação @Entity indica que esta classe é uma entidade JPA, ou seja, ela será mapeada para uma tabela no banco de dados.
@Entity
public class Usuario {

    // A anotação @Id marca o atributo como a chave primária da entidade.
    // A anotação @GeneratedValue especifica a estratégia de geração de valores para a chave primária (IDENTITY indica auto-incremento).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Atributo para armazenar o nome do usuário.
    private String nome;
    
    // Atributo para armazenar o e-mail do usuário.
    private String email;

    // Construtor padrão exigido pelo JPA.
    public Usuario() {}

    // Construtor com parâmetros para facilitar a criação de instâncias da classe.
    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Métodos getters e setters para acessar e modificar os atributos privados da classe.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


//@Entity indica que esta classe é uma entidade JPA, que será mapeada para uma tabela no banco de dados.

//@Id marca o atributo id como a chave primária da entidade.

//@GeneratedValue(strategy = GenerationType.IDENTITY) especifica que o valor do id será gerado automaticamente pelo banco de dados (auto-incremento).

//Os atributos nome e email são simples campos que serão mapeados para colunas na tabela do banco de dados.

//Existem construtores para inicialização da classe, incluindo um construtor vazio exigido pelo JPA e um construtor com parâmetros para facilitar a criação de instâncias da classe.

//Métodos getters e setters são fornecidos para acessar e modificar os atributos privados da classe, seguindo as convenções JavaBean.
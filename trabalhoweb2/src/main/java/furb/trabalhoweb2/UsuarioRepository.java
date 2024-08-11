package furb.trabalhoweb2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A anotação @Repository marca esta interface como um componente do Spring que lida com o acesso a dados.
@Repository
// A interface JpaRepository é uma interface do Spring Data JPA que fornece métodos CRUD padrão para operações no banco de dados.
// Ela requer dois parâmetros: o tipo da entidade (Usuario neste caso) e o tipo da chave primária (Long neste caso).
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

// Repositórios para outras entidades semelhantes (PapelRepository, TarefaRepository, etc.)


/* 
@Repository:

Anotação do Spring que indica que UsuarioRepository é um componente de repositório, usado para gerenciar a interação com o banco de dados para a entidade Usuario.
JpaRepository<Usuario, Long>:

JpaRepository é uma interface fornecida pelo Spring Data JPA que estende a interface CrudRepository.
Ela oferece métodos CRUD padrão, como save(), findById(), findAll(), deleteById(), entre outros, para operações com a entidade Usuario.
Os parâmetros <Usuario, Long> indicam que esta interface gerencia entidades do tipo Usuario e que o identificador (chave primária) é do tipo Long.
Uso de Repositórios para Outras Entidades:

Você pode criar repositórios semelhantes (PapelRepository, TarefaRepository, etc.) para outras entidades da mesma forma, estendendo JpaRepository e especificando a entidade e o tipo da chave primária apropriados.
Esta interface UsuarioRepository permite que o Spring Data JPA forneça a implementação dos métodos de acesso a dados necessários para a entidade Usuario, facilitando assim a interação com o banco de dados sem a necessidade de escrever código SQL diretamente.
*/
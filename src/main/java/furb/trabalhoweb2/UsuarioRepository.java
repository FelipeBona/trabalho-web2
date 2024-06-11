package furb.trabalhoweb2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

// Repositórios para outras entidades semelhantes (PapelRepository, TarefaRepository, etc.)

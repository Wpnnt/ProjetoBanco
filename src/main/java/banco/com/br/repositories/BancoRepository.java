package banco.com.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import banco.com.br.entities.Usuario;

@Repository
public interface BancoRepository extends JpaRepository<Usuario, Integer> {

}



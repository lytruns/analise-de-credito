package br.com.braz.rui.analisedecredito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.braz.rui.analisedecredito.domain.Usuario;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

}


package br.com.Cinetime.Cinetime.Repository;


import br.com.Cinetime.Cinetime.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

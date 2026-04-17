package br.com.Cinetime.Cinetime.Service;



import br.com.Cinetime.Cinetime.Exception.ProductNotFoundException;
import br.com.Cinetime.Cinetime.Model.Usuario;
import br.com.Cinetime.Cinetime.Repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}

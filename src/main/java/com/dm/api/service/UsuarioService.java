package com.dm.api.service;

import java.util.List;
import java.util.Optional;
import com.dm.api.model.Usuario;

public interface UsuarioService {
    List<Usuario> buscarTodos();
    Usuario criar(Usuario usuario);
    Usuario atualizar(Usuario usuario);
    void remover(Integer id);
    Optional<Usuario> buscarPorId(Integer id);
}

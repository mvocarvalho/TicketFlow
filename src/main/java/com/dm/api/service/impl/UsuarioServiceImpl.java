package com.dm.api.service.impl;

import java.util.List;
import java.util.Optional;
import com.dm.api.model.Usuario;
import com.dm.api.repository.UsuarioRepository;
import com.dm.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario criar(Usuario usuario) {
        Usuario usu = usuarioRepository.findByLogin(usuario.getLogin()).orElse(null);
        if(usu == null){
            return usuarioRepository.save(usuario);
        }
        throw new RuntimeException("Usuário já existe");
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        Usuario usu = usuarioRepository.findByLogin(usuario.getLogin()).orElse(null);
        if(usu != null){
            return usuarioRepository.save(usuario);
        }
        throw new RuntimeException("Usuário não existe");
    }

    @Override
    public void remover(Integer id) {
        Usuario usu = usuarioRepository.findById(id).orElse(null);
        if(usu != null){
            usuarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não existe");
        }
    }

    @Override
    public Optional<Usuario> buscarPorId(Integer id) {
        return usuarioRepository.findById(id);
    }
}

package com.porto.unit.squad18fabtec.service.impl;

import java.util.List;
import java.util.Optional;
import com.porto.unit.squad18fabtec.model.Usuario;
import com.porto.unit.squad18fabtec.repository.UsuarioRepository;
import com.porto.unit.squad18fabtec.service.UsuarioService;
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
        Usuario usu = usuarioRepository.findById(usuario.getId()).orElse(null);
        if(usu == null){
            return usuarioRepository.save(usuario);
        }
        throw new RuntimeException("Usuário já existe");
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        Usuario usu = usuarioRepository.findById(usuario.getId()).orElse(null);
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

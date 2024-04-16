package com.dm.api.controller;

import java.util.List;
import com.dm.api.model.Usuario;
import com.dm.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos(){
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.criar(usuario));
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.atualizar(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable Integer id){
        usuarioService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(usuarioService.buscarPorId(id).orElse(null));
    }


}

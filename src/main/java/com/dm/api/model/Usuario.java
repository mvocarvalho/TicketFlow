package com.dm.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "login", length = 60)
    private String login;

    @Column(name = "senha", length = 60)
    private String senha;

    @Column(name = "dataCadastro")
    private LocalDate dataCadastro;

}

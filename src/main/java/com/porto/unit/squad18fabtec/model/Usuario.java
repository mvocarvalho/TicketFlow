package com.porto.unit.squad18fabtec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Usuario")
public class Usuario {

    @Id
    private Integer id;

    @Column(name = "login", length = 60)
    private String login;

    @Column(name = "senha", length = 60)
    private String senha;

}

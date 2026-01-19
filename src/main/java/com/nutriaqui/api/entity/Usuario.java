package com.nutriaqui.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios") // Boa prática para garantir o link com a tabela exata
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String tipo;
}

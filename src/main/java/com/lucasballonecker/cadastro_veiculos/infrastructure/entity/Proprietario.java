package com.lucasballonecker.cadastro_veiculos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "proprietario")
@Table
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proprietario;
    @Column(unique = true, nullable = false)
    private String cpf;
    @OneToOne(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private Veiculo veiculo;

    public Proprietario(String proprietario, String cpf){
        this.proprietario = proprietario;
        this.cpf = cpf;
    }
}


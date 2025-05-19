package com.lucasballonecker.cadastro_veiculos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "veiculo")
@Table
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "proprietario_id")
    @OneToOne
    private Proprietario proprietario;
    @Column(unique = true, nullable = false)
    private String placa;
    private String marca;
    private String modelo;
    private String chassi;
    private Boolean licenciado;

    public Veiculo(String placa, String marca, String modelo, String chassi, Boolean licenciado, Proprietario proprietario){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.licenciado = licenciado;
        this.proprietario = proprietario;
    }
}

package com.unisatc.backend.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "apolice")
public class ApoliceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "cliente")
    private ClienteEntity cliente;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate inicio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fim;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "celular")
    private CelularEntity celular;
    @ManyToOne
    @JoinColumn(name = "funcionario")
    private FuncionarioEntity funcionario;
}

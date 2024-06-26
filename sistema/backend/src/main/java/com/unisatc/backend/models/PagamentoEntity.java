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
@Table(name = "pagamento")
public class PagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "cliente")
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name = "celular")
    private CelularEntity celular;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "tipo_pagamento")
    private TipoPagamentoEntity tipo_pagamento;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "sinistro")
    private SinistroEntity sinistro;
}

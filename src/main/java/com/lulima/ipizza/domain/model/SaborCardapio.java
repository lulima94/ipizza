package com.lulima.ipizza.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Data
public class SaborCardapio {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private BigDecimal preco;

    @ManyToOne
    private Cardapio cardapio;

    @ManyToOne
    private Sabor sabor;
}

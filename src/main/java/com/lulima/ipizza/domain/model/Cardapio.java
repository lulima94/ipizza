package com.lulima.ipizza.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Cardapio {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @OneToMany
    private List<SaborCardapio> saborCardapioList;

}

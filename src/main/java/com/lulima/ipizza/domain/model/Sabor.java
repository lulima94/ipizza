package com.lulima.ipizza.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Sabor {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nome;
}

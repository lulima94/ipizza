package com.lulima.ipizza.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Cardapio {

    @Id
    @GeneratedValue
    private Integer id;
}

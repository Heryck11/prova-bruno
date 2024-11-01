package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProdutoDTO{

    private Integer id;

    private String DesPro;

    private double DtaProduto;

    private double ValProduto;
}

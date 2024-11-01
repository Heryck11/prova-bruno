package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data

public class PedidoDTO {

    private Integer id;

    private long NroPedido;

    private LocalDate DatPedido;
}
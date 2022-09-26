package com.entra21.primeiroprojetospring.model.dto;


import lombok.Data;

@Data
public class ItemPayloadDTO {
    private long idItem;
    private String titulo;
    private boolean emprestado;
}

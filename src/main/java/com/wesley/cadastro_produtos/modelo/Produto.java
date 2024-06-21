package com.wesley.cadastro_produtos.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private String nome;
    private String descricao;
    private Double valor;
    private Boolean disponivelVenda;
}

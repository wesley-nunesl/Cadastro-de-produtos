package com.wesley.cadastro_produtos.servico;

import com.wesley.cadastro_produtos.modelo.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoServico {

    private List<Produto> produtosList = new ArrayList<>();


    public List<Produto> listarTodosProdutos(){
        return produtosList.stream()
                .sorted(Comparator.comparingDouble(Produto::getValor))
                .collect(Collectors.toList());
    }

    public void adcionarProduto(Produto produto){
        produtosList.add(produto);
    }
}

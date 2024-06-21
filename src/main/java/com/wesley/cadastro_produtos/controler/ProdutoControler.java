package com.wesley.cadastro_produtos.controler;

import com.wesley.cadastro_produtos.modelo.Produto;
import com.wesley.cadastro_produtos.servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProdutoControler {

    private final ProdutoServico produtoServico;

    @Autowired
    public ProdutoControler(ProdutoServico produtoServico){
        this.produtoServico = produtoServico;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("produtos", produtoServico.listarTodosProdutos());
        return "index";
    }

    @GetMapping("/cadastrarProduto")
    public String novoProdutoForm(Model model){
        model.addAttribute("produto", new Produto());
        return "cadastrarProduto";
    }

    @PostMapping("/cadastrarProduto")
    public String novoProdutoSubmit(@ModelAttribute Produto produto){
        produtoServico.adcionarProduto(produto);
        return "redirect:/";
    }

}

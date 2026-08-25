package br.edu.ifpr.loja.controller;

import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.loja.model.Produto;
import br.edu.ifpr.loja.repository.ProdutoRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProdutoController {
    private ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }
@GetMapping("/produtos")


    public List<Produto> listar(){
        return repository.findAll();
    }
    @GetMapping("/produtos/{id}")
    public Produto buscar(@PathVariable int id) {
        return repository.findById(id).orElse(null);

    }

    @PostMapping("/produtos")
    public Produto cadastrar(@RequestBody Produto produto) {
       
        
        return repository.save(produto);
    }
    
    

}

package br.money.borges.moneyapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.money.borges.moneyapi.model.Categoria;
import br.money.borges.moneyapi.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    } 
}

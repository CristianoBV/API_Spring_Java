package br.money.borges.moneyapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.money.borges.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // List<Categoria> findAll();

}

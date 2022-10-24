package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    //Postagem, veio da classe Model, foi ela quem gerou a tabela tb_postagens

    List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}

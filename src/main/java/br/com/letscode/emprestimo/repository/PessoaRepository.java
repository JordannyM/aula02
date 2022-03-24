package br.com.letscode.emprestimo.repository;

import br.com.letscode.emprestimo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Pessoa findByCpf(String cpf);

    List<Pessoa> findByNome(String nome);

    List<Pessoa> findByNomeContaining(String nome);

    List<Pessoa> findByNomeEndsWith(String nome);

    @Query("SELECT sum(salario) from pessoa")
    Double sumSalarios();

    @Query("SELECT sum(salario) from pessoa where nome=nome")
    Double sumSalarios(String nome);

}

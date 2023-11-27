package com.cadastroapi.ProjetoAPI.DAO;

import com.cadastroapi.ProjetoAPI.Entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}

package edu.ifal.br.lembretes_controlador;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repoLembrete extends CrudRepository<Lembretes, Long>{

}
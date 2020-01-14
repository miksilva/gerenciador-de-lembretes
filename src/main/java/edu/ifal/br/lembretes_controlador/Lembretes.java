package edu.ifal.br.lembretes_controlador;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Lembretes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Descricao;
    @DateTimeFormat(pattern = "dd/MM/yyy")
    private Date data;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
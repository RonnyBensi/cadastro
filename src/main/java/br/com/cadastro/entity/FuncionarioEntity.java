package br.com.cadastro.entity;

 


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @author Ronny Bensi
 * Entidade de Funcionarios 
 *
 */

@Entity(name = "Funcionario")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
 
	@Column(name = "nome")
	private String nome;
 
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "document")
	private String document;
	
	//cargo_id int FK
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

}
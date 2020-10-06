package br.com.cadastro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
/**
 * 
 * @author Ronny Bensi
 * Entidade de Departamentos 
 *
 */
public class DepartamentoEntity {

	@GeneratedValue
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;
 
	
	
}

package br.com.cadastro.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cadastro.entity.FuncionarioEntity;
import br.com.cadastro.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
@Api(value = "/", description = "Funcionario")

public class FuncionarioResource {

    @Autowired
    private FuncionarioRepository repository;
	
	@GetMapping(value = "Listar Funcionario por Departamento")
	public String criacao() {
		String teste = "Validado Teste Listar Funcionario por Departamento\"";
		return teste;
	}
	
	@GetMapping(value = "Listar Funcionario por Chefe")
	public String criacao4() {
		String teste = "Validado Teste Listar Funcionario por Chefe";
		return teste;
	}
	 @GetMapping(value = "Listar Historico de Departamento por Funcionario")
		public String criacao2() {
			String teste2 = "Validado Listar Historico de Departamento por Funcionario";
			return teste2;
	}

		@GetMapping(value = "consulta-3")
			public String criacao3() {
				String teste3 = "Validado Teste 3";
				return teste3;
		} 

		
		@GetMapping(value = "Consulta Todos")
			public Iterable<FuncionarioEntity> list() {
		    	return repository.findAll();
		}



}

package com.keeggo.steps;

import java.io.IOException;

import com.keeggo.elementos.RegistroElements;
import com.keeggo.pages.Browser;
import com.keeggo.pages.Cadastro;
import com.keeggo.pages.Metodos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistroSteps {

	Browser lg = new Browser();
	Cadastro cadastro = new Cadastro();
	Metodos metodo = new Metodos();
	RegistroElements elemento = new RegistroElements();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		lg.navegadorLogin(site);

	}

	@When("acesso o formulario de abertura de conta e preencho o cadastro")
	public void acesso_o_formulario_de_abertura_de_conta_e_preencho_o_cadastro() throws InterruptedException, IOException {
		cadastro.preencherCadastro("Henrique10", "luizhenrique.silva201216@gmail.com", "Th10203040", "Th10203040", "Luiz",
				"Henrique", "976740805", "Brasil", "são paulo", "são paulo", "rua rizieri negrini", "04257143");

	}


	@Then("a conta sera gerada e o login validado")
	public void a_conta_sera_gerada_e_o_login_validado() throws IOException, InterruptedException {
    
	metodo.esperar(5000);
    metodo.validarTexto("Henrique10", elemento.getNomeuser());
    
    metodo.screenshot("CT05_VALIDAR_NOME");
    
   metodo.fecharNavegador();
		
		
	}
	

}

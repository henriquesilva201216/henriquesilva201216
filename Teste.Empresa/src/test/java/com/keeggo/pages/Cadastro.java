package com.keeggo.pages;

import java.io.IOException;

import com.keeggo.elementos.RegistroElements;

public class Cadastro {

	Metodos metodo = new Metodos();
	RegistroElements elemento = new RegistroElements();

	public void preencherCadastro(String nome, String email, String senha, String cSenha, String fNome, String lNome,
			String cel, String Pais, String estado, String cidade, String endereço, String cep)
			throws InterruptedException, IOException {

		metodo.esperar(5000);
		metodo.clicar(elemento.getReglogin());
		metodo.esperar(5000);
		metodo.clicar(elemento.getNewuser());
		metodo.escrever(elemento.getRegistrNome(), nome);
		metodo.escrever(elemento.getRegistroEmail(), email);
		metodo.escrever(elemento.getPassword(), senha);
		metodo.escrever(elemento.getConfripass(), cSenha);
		metodo.screenshot("CT01_ACCOUNT_DETAILS");

		metodo.escrever(elemento.getFirstname(), fNome);
		metodo.escrever(elemento.getLastname(), lNome);
		metodo.escrever(elemento.getPhone(), cel);
		metodo.screenshot("CT02_PERSONAL_DETAILS");

		metodo.escrever(elemento.getSelectcountry(), Pais);
		metodo.escrever(elemento.getEstado(), estado);
		metodo.escrever(elemento.getCityName(), cidade);
		metodo.escrever(elemento.getAddress(), endereço);
		metodo.escrever(elemento.getCepCodigo(), cep);
		metodo.screenshot("CT03_ADDRESS");

		metodo.clicar(elemento.getSelectIgree());
		metodo.clicar(elemento.getBtnRegister());

		metodo.screenshot("CT04_REGISTER");
	}

}

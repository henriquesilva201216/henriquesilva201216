#Author:LUIZHENRIQUE.SILVA201216@GMAIL.COM

@Executa
Feature: Preencher formulario do teste
 Eu como usuario quero acessar o site para preencher o formulario e fazer o login

  @Executa1
  Scenario: Preencher formulario e fazer loginn
    Given que eu esteja no site "http://advantageonlineshopping.com"
    When acesso o formulario de abertura de conta e preencho o cadastro
   Then a conta sera gerada e o login validado
    
    
    
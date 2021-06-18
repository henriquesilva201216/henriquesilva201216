package com.keeggo.pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {

	//metodo para clicar nos botões
		public void clicar (By elemento) {
			lDriver().findElement(elemento).click();
	
		
		}
		//metodo para tirar screenshot da página e criar evidencia
		public void screenshot (String nomeSrc) throws IOException {

			TakesScreenshot srcShot = ((TakesScreenshot) lDriver());
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeSrc + ".png");
			FileUtils.copyFile(srcFile, destFile);

		}

		
		//metodo para validar o texto
		public void validarTexto(String text, By elemento) {

			String texto = lDriver().findElement(elemento).getText();
			assertEquals(text, texto);
		

		}

		
		//metodo para esperar carregar os elementos ou botões
		public void esperar(int tempo) throws InterruptedException {

			Thread.sleep(tempo);
		}

		//metodo para escrever textos
		public void escrever(By elemnto, String texto) {
			lDriver().findElement(elemnto).sendKeys(texto);

		}
		
		//metodo para fechar browser
		public void fecharNavegador() {
			
			lDriver().quit();
			  

		}
		
	}

	
	



package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TelaUsuariosPage {
	
	//CONSTRUTOR
	public TelaUsuariosPage() {
		PageFactory.initElements(driver, this);
	}

	//ELEMENTOS
	
	//@FindBy(xpath = "//tr//td//a")
	//private List<WebElement> nomesUsuarios;
	
	
	
	
	//METODO
	public void clicarNoUsuario(String nomeUsuario) {
		//WebElement usuario = driver.findElement(By.xpath("//a[.=" + nomeUsuario +"]"));
		//usuario.click();
		driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']")).click(); 
	}
	
	public void validarUsuarioCadastrado(String nomeUsuario) {
		assertTrue(driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']")).isDisplayed());
	}
	
}

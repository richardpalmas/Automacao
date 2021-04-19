package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "welcome")
	private WebElement textoUsuarioLogado;
	
	@FindBy(xpath = "//span[@id='notification']/.")
	private WebElement iconeSino;	
	
	@FindBy(linkText = "Admin")
	private WebElement abaAdmin;	
	
	public void validarUsuarioLogado(String string) {
		assertEquals(string, textoUsuarioLogado.getText());	
	}
	
	public void validarIconeSino() {
		assertTrue(iconeSino.isDisplayed());	
	}
	
	public void clicarAbaAdmin() {
		abaAdmin.click();	
	}

}
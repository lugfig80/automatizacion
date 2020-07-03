package motoresdebusqueda;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matcher;




@DefaultUrl("http://automationpractice.com/index.php")
public class paginaInicio extends PageObject {

@FindBy (xpath="//img[@class='logo img-responsive']")
WebElementFacade logo;

@FindBy (xpath ="//a[@title='Women']")
WebElementFacade women;

@FindBy (xpath="//span[contains(text(),'--')]")
WebElementFacade listaD;

@FindBy (id = "selectProductSort")
WebElementFacade ordenarPor;


public void verLogo () {
	logo.isDisplayed();	
}

public void verWomen() {
	women.click();
}

public void listaDiv( ) {
	listaD.click();
	
}

/*public void listaDesp(String datoPrueba) {
	ordenarPor.click();
	ordenarPor.selectByVisibleText(datoPrueba);*/
public void listaDesp() {
	ordenarPor.click();
	
	//ordenarPor.selectByVisibleText(datoPrueba);
}
}

package motoresdebusqueda;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercuryreservation.php")
public class flightPageObject extends PageObject {
	
	@FindBy(name ="userName")
	WebElementFacade user;
	
	@FindBy(name ="password")
	WebElementFacade passw;
	
	@FindBy(xpath ="//input[@name='login']")
	WebElementFacade btnSign;
	
	@FindBy(xpath ="//img[@src=\"/images/masts/mast_flightfinder.gif\"]")
	WebElementFacade vuelosBusq;
	
	@FindBy(xpath ="//select[@ name=\"passCount\"]")
	WebElementFacade pasajeros;
	
	@FindBy(name ="fromPort")
	WebElementFacade salida;
	
	@FindBy(name="toPort")
	WebElementFacade llegada;
	
	@FindBy (name="findFlights")
	WebElementFacade consultar;

public void signIn(String usuario , String clave ) {
	user.sendKeys(usuario);
	passw.sendKeys(clave);
	btnSign.click();
}

public void busquedaVuelo() throws InterruptedException {
	Thread.sleep(2000);
	vuelosBusq.isDisplayed();
	
}

public void cuentaPass (String dato) {
	pasajeros.click();
	pasajeros.selectByVisibleText(dato);
	
}

public void saliendoDe(String from) {
	salida.click();
	salida.selectByVisibleText(from);
	
}

public void llegandoA(String to) {
	llegada.click();
	llegada.selectByVisibleText(to);
	consultar.click();
	
}



}
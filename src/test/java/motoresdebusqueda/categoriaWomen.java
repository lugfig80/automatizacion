package motoresdebusqueda;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class categoriaWomen extends PageObject {

	@FindBy(css="#productsSortForm")
	WebElementFacade ordenarPor;
	

public void ordenar () {
	ordenarPor.click();
}
	
}

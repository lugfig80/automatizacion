package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import motoresdebusqueda.categoriaWomen;
import motoresdebusqueda.paginaInicio;
import net.thucydides.core.annotations.Steps;


public class login {
	
	@Steps
	paginaInicio primera;
	
	/*@Steps
	categoriaWomen women;*/

	
	@Given("^Que el usuario ingresa a web My store$")
	public void que_el_usuario_ingresa_a_web_My_store() {
	   primera.setDefaultBaseUrl("http://automationpractice.com/index.php");
	   primera.open();
	   primera.verLogo();
	}

	@Given("^ingresa sesion women$")
	public void ingresa_sesion_women() {
	    primera.verWomen();
	}

	@When("^ordena por precio mas alto$")
	public void ordena_por_precio_mas_alto() throws InterruptedException {
		primera.listaDiv();
		Thread.sleep(6000);
	   	primera.listaDesp();
	}


}

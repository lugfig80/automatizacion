package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.flightPageObject;
import net.thucydides.core.annotations.Steps;

public class flightDefiniton {

	@Steps
	flightPageObject finder;

	@Given("ingresa usuario {string} y clave {string}")
	public void el_usuario_ingresa_y_clave_demo(String Usuario, String Clave) {
		finder.setDefaultBaseUrl("http://newtours.demoaut.com/mercuryreservation.php");
		finder.open();
		finder.signIn(Usuario, Clave);
	}

	@Given("en la seccion flight finder")
	public void en_la_seccion_flight_finder() throws InterruptedException {
		finder.busquedaVuelo();
	}

	@When("el usuario require vuelo para dos pasajeros")
	public void el_usuario_require_vuelo_para_dos_pasajeros() {
		finder.cuentaPass("2");
	}

	@When("^saliendo de londres$")
	public void saliendo_de_londres() {
		finder.saliendoDe("London");

	}

	@Then("arrivando en san francisco consulta disponibilidad")
	public void arrivando_en_francisco_consulta_disponibilidad() {
		finder.llegandoA("San Francisco");

	}

}

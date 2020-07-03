import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
	
        features = "src/test/resources/features/" ,tags="@flightfinder" 
        //dryRun=true,
        //strict=true
) 
public class Runner {

}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags ="@reg", plugin = {"pretty", "html:target/tsr/tsr.html"})
public class Run {
}

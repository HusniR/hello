package hello.storytests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class SmokeIT {

	private String line = null;
	@When("^I run HelloWorld$")

     public void run_hello_world() throws Exception {
           
        /* determine classpath for running HelloWorld */
    	String cp = System.getenv("HELLOWORLD_CLASSPATH");
		if (cp == null) throw new RuntimeException("HELLOWORLD_CLASSPATH not set in environment");
	
		/* Launch the HelloWorld program in a process. */
		Process process = Runtime.getRuntime().exec("java -cp " + cp + " hello.HelloWorld");
		InputStream processOutput = process.getInputStream();
	
		/* read output stream into a String */
		InputStreamReader reader = new InputStreamReader(processOutput);
		BufferedReader br = new BufferedReader(reader);
        this.line = br.readLine();
     }

     @Then("^it displays \"Hello world!\"$")
     public void it_displays_hello_world() throws Exception {
		assertEquals("Hello world!", this.line);
     }
}

package wiremock;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

import com.github.tomakehurst.wiremock.standalone.WireMockServerRunner;

/**
 * Goal which touches a timestamp file.
 */
@Mojo(name = "run")
public class MyMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        getLog().info("Starting wiremock.");
        WireMockServerRunner.main("--port", "9091");
    }
}

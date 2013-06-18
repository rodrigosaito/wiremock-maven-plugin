package wiremock;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
        // File f = outputDirectory;
        //
        // if (!f.exists()) {
        // f.mkdirs();
        // }
        //
        // File touch = new File(f, "touch.txt");
        //
        // FileWriter w = null;
        // try {
        // w = new FileWriter(touch);
        //
        // w.write("touch.txt");
        // } catch (IOException e) {
        // throw new MojoExecutionException("Error creating file " + touch, e);
        // } finally {
        // if (w != null) {
        // try {
        // w.close();
        // } catch (IOException e) {
        // // ignore
        // }
        // }
        // }
    }
}

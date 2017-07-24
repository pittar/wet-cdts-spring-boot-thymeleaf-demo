package ca.pitt.wet.cdts.demo.wetcdtsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Application Config.
 * 
 * @author Andrew Pitt
 * @since 1.0.0
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, H2ConsoleAutoConfiguration.class })
public class ApplicationConfig {

	/**
	 * Main method.
	 * 
	 * @param args
	 *            <code>String[]</code>
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}

}

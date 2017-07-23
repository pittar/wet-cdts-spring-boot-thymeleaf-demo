package ca.pitt.wet.cdts.demo.wetcdtsspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Application Config.
 * 
 * @author Andrew Pitt
 * @since 1.0.0
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, H2ConsoleAutoConfiguration.class })
public class ApplicationConfig {

	/**
	 * Application message source. Uses WET CDTS message source as its parent.
	 * 
	 * @param wetCDTSMessageSource
	 *            <code>MessageSource</code>
	 * @return <code>MessageSource</code>
	 */
	@Bean(name = "messageSource")
	public MessageSource messageSource(@Qualifier("wetCDTSMessgeSource") MessageSource wetCDTSMessageSource) {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setParentMessageSource(wetCDTSMessageSource);
		messageSource.setBasenames("messages", "urls");
		return messageSource;
	}

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

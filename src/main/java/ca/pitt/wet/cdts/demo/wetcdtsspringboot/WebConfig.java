package ca.pitt.wet.cdts.demo.wetcdtsspringboot;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import ca.canada.ised.wet.cdts.components.wet.interceptor.WETLocaleChangeInterceptor;
import ca.canada.ised.wet.cdts.components.wet.interceptor.WETTemplateInterceptor;

/**
 * Web configuration.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer, HandlerInterceptor {

    /** The WET CDTS template interceptor. */
    @Autowired
    private WETTemplateInterceptor cdnTemplateInterceptor;

    /**
     * Locale resolver.
     * 
     * @return <code>LocaleResolver</code>
     */
    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver slr = new CookieLocaleResolver();
        slr.setDefaultLocale(Locale.CANADA);
        return slr;
    }

    /**
     * LocaleChangeInterceptor.
     * 
     * @return <code>LocaleChangeInterceptor</code>
     */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        WETLocaleChangeInterceptor lci = new WETLocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    /** {@inheritDoc} */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
        registry.addInterceptor(cdnTemplateInterceptor);
    }
}

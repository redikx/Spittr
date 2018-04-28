// Glowna klasa definiujaca mapowanie serwletu dystrybutora, klase konfigurujaca serwletu
// dystrybutora i klase konfigurujaca serwletu nasluchajacego

package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    // mapowanie servletu dystrybutora
    @Override
    protected String[] getServletMappings() {
	return new String[] {"/"};
    }

    // klasa konfiguracji serwletu dystrybutora
    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class<?>[] {WebConfig.class};
    }
    
    // klasa konfiguracji serwletu nasluchujacego 
    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] {RootConfig.class};
    }


}

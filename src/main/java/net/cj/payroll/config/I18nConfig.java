package net.cj.payroll.config;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import net.rakugakibox.util.YamlResourceBundle;

@Configuration
public class I18nConfig implements WebMvcConfigurer {
	
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setDefaultLocale(Locale.KOREA);
		resolver.setCookieName("lang");
		return resolver;
	}
	
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
	
	@Bean("messageSource")
	public MessageSource messageSource(
			@Value("${spring.messages.basename}") String basename,
			@Value("${spring.messages.encoding}") String encoding
			) {
		YamlMessageSource ms = new YamlMessageSource();
		ms.setBasename(basename);
        ms.setDefaultEncoding(encoding);
        ms.setAlwaysUseMessageFormat(true);
        ms.setUseCodeAsDefaultMessage(true);
        ms.setFallbackToSystemLocale(true);
        return ms;
	}
}
	
class YamlMessageSource extends ResourceBundleMessageSource {
	@Override
    protected ResourceBundle doGetBundle(String basename, Locale locale) throws MissingResourceException {
        return ResourceBundle.getBundle(basename, locale, YamlResourceBundle.Control.INSTANCE);
    }
}


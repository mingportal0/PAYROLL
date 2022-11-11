package net.cj.payroll.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfigTest {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/login", "/signUp", "/access_denied", "/resources/**").permitAll()
				.antMatchers("/userAccess").hasRole("USER") // USER만 접근 허용
				.anyRequest()
				.authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/login_proc")
				.defaultSuccessUrl("/user_access")
				.failureUrl("/access_denied")
			.and()
			.csrf().disable();
		return http.build();
	}
}

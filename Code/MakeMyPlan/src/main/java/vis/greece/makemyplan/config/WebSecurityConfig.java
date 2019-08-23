package vis.greece.makemyplan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.vis.core.security.filter.ExceptionEntryPointInterceptor;
import com.vis.core.security.filter.JWTFilter;

import vis.greece.logging.filter.MDCLogFilter;
import vis.greece.mongo.repositories.AssetCachingRepo;
import vis.greece.security.serviceImpl.TokenAuthenticationServiceImpl;

/**
 * web security config to exclude some urls from JwtFilter using permitAll
 * criteria, urls that are excluded are related to authentication and probes
 * urls
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ExceptionEntryPointInterceptor exceptionEntryPointInterceptor;

	@Autowired
	private AssetCachingRepo assetCachingRepo;

	@Bean
	public TokenAuthenticationServiceImpl getTokenProvider() {
		return new TokenAuthenticationServiceImpl(assetCachingRepo);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.exceptionHandling().authenticationEntryPoint(exceptionEntryPointInterceptor).and().csrf().disable()
				.authorizeRequests().antMatchers(HttpMethod.GET, "/prometheus").permitAll()
				.antMatchers(HttpMethod.GET, "/v2/api-docs").permitAll().antMatchers(HttpMethod.GET, "/actuator/**")
				.permitAll().antMatchers(HttpMethod.GET, "/mappings").permitAll().antMatchers(HttpMethod.GET, "/beans")
				.permitAll().antMatchers(HttpMethod.GET, "/info").permitAll().antMatchers(HttpMethod.GET, "/trace")
				.permitAll().antMatchers(HttpMethod.GET, "/autoconfig").permitAll().antMatchers(HttpMethod.GET, "/env")
				.permitAll().antMatchers(HttpMethod.GET, "/configprops").permitAll()
				.antMatchers(HttpMethod.GET, "/health").permitAll().antMatchers(HttpMethod.GET, "/metrics").permitAll()
				.antMatchers(HttpMethod.GET, "/backendhealth").permitAll().antMatchers(HttpMethod.GET, "/kafkahealth")
				.permitAll().antMatchers(HttpMethod.GET, "/gr/v1/sales/order**").permitAll()
				.antMatchers(HttpMethod.POST, "/gr/v1/sales/order**").permitAll()
//				.antMatchers(HttpMethod.GET,"/gr/v1/redFamily/**").permitAll()
				.anyRequest()
				.authenticated().and()
				.addFilterBefore(new JWTFilter(getTokenProvider()), UsernamePasswordAuthenticationFilter.class)
				.addFilterAfter(new MDCLogFilter(), JWTFilter.class);
	}

}

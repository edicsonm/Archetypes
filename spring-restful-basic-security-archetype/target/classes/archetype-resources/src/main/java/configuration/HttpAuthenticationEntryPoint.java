#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/*
 * This class was developed to override the default behaviour of the Spring security -that is to show a login
 * form when a authentication is required.
 * 
 * Class extends org.springframework.security.web.AuthenticationEntryPoint, and implements only one method, 
 * which sends response error (with 401 status code) in cause of unauthorized attempt.
 * 
 * */

@Component( "httpAuthenticationEntryPoint" )
public class HttpAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, 
			AuthenticationException authenticationException) throws IOException, ServletException {
			System.out.println("Ejecutando la clase HttpAuthenticationEntryPoint ...");
			response.sendError( HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized" );
	}

}

package com.keomagroup.sgs.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class CorsFilter extends HttpFilter implements Filter {
       

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		if(response instanceof HttpServletResponse){
            HttpServletResponse res = (HttpServletResponse) response;
            System.out.println("Correu aqui dentro");
            
            res.addHeader("Access-Control-Allow-Origin", "*"); 
    		res.addHeader("Access-Control-Allow-Headers", "*");
    		res.addHeader("Access-Control-Allow-Credentials", "true");
    		res.addHeader("Access-Control-Allow-Methods", "*");
        }else {
        	System.out.println("Ocorreu um erro Qualquer");
        }
		
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

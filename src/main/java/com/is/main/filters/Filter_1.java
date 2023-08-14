package com.is.main.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filter_1
 */
public class Filter_1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter_1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		//요청 발생시 실행
		System.out.println("Filter1 Request");
		
		HttpSession session=((HttpServletRequest)request).getSession();
		Object obj =session.getAttribute("member");
		
		if(obj!=null) {
			chain.doFilter(request, response);//다음필터가있으면불러오게함		
		}else {
			//forward
//			RequestDispatcher view= request.getRequestDispatcher("/WEB-INF/views/)"
//			view.forward(request, response);
			//redirect
			((HttpServletResponse)response).sendRedirect("../member/login");
		}
		
		System.out.println("Filter1 Response");
		//응답 발생시 실행
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

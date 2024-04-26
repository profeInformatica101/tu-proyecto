package com.miproyecto.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet de ejemplo
 * 
 * @author ENDES
 * @version 1.0
 * 
 */
@WebServlet("/miServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test session attributess <br>");
		HttpSession sesion = request.getSession();
		
		System.out.println("<-- "  ); 
		synchronized (sesion) {
			sesion.setAttribute("foo", "22");
			sesion.setAttribute("foo", "42");
			
			out.println(sesion.getAttribute("foo"));
		}
		/*
		request.setAttribute("clave", "valor");
		request.removeAttribute("clave");
	      response.getWriter().print("Hola desde MiServlet!");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void attributeTest(ServletRequestAttributeEvent ev) {
		System.out.println("---> " + ev.getName() + "-->" + ev.getValue() ); 
	}

}

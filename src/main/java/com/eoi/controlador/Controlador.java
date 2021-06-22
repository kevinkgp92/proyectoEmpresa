package com.eoi.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoi.model.Departamento;
import com.eoi.model.DepartamentoDAO;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String coddepto = request.getParameter("coddepto");
		DepartamentoDAO ddao = new DepartamentoDAO();
		Departamento dpto = null;

		String destPage = "datosdepartamento.jsp";

		switch (opcion) {
		case "e":
			destPage = "editardepartamento.jsp";
			try {
				dpto = ddao.getDepartamento(coddepto);
				request.setAttribute("dpto", dpto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case "b":
			try {
				ddao.borrarDpto(coddepto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String coddepto = request.getParameter("coddepto");
		String nombredpto = request.getParameter("nombredpto");
		String ciudad = request.getParameter("ciudad");
		String coddirector = request.getParameter("coddirector");

		Departamento dpto = new Departamento(coddepto, nombredpto, ciudad, coddirector);
		DepartamentoDAO ddao = new DepartamentoDAO();

		String destPage = "datosdepartamento.jsp";

		try {
			if (opcion.equals("e")) {
				ddao.modificarDpto(dpto);
			}
			if (opcion.equals("a")) {
				ddao.altaDpto(dpto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
		dispatcher.forward(request, response);

	}

}

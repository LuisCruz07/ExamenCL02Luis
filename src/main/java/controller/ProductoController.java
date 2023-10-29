package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoProducto;
import model.TblProductocl2;

/**
 * Servlet implementation class ProductoController
 */
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DaoProducto prod = new DaoProducto();
		List<TblProductocl2> list = prod.ListarProducto();
		request.setAttribute("listar", list);
		
		request.getRequestDispatcher("examn.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoProducto prod = new DaoProducto();
		TblProductocl2 pro = new TblProductocl2();
		pro.setNombrecl2(request.getParameter("nombrecl2"));
		pro.setEstadocl2(request.getParameter("estadocl2"));
		pro.setDescripcl2(request.getParameter("descripcl2"));
		pro.setPrecioventacl2(Double.parseDouble(request.getParameter("precioventacl2")));
		pro.setPreciocompcl2(Double.parseDouble(request.getParameter("preciocompcl2")));
		prod.AgregarProducto(pro);
		
		response.sendRedirect("/LPII_EXAMEN_CRUZ_RODRIGUEZ/ProductoController");
			
	}
}

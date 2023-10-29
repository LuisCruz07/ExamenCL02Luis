package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoUsuario;

/**
 * Servlet implementation class UsuarioController
 */
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoUsuario duser = new DaoUsuario();
		
		String user =  request.getParameter("usuario");
		String pass =  request.getParameter("contrasena");
		
		boolean ds =  duser.Login(user, pass);
		
		if(ds == true){
			response.sendRedirect("/LPII_EXAMEN_CRUZ_RODRIGUEZ/ProductoController");
		}else{
			response.sendRedirect("/LPII_EXAMEN_CRUZ_RODRIGUEZ/UsuarioController");
		}
	}

}

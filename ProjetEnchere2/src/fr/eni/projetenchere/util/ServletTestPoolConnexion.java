package fr.eni.projetenchere.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ServletTestPoolConnexion
 */
@WebServlet("/ServletTestPoolConnexion")
public class ServletTestPoolConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	
	
	try {
	Context context = new InitialContext(); 
	//recherche de la DataSource 
	DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx"); 
	//Demande une connexion pr effectuer les traitements qui m'intéressent 
	//La méthode getConnection met la demande en attente tant qu'il n'y a pas 
	//de connexions disponibles dans le pool
	Connection cnx = dataSource.getConnection(); 
	out.print ("la connexion est " + (cnx.isClosed()?"fermée":"ouverte")+".");
	//Libérer le connexion lorsque l'on en a plus besoin 
	cnx.close();//IMPORTANT : ici, la connexion n'est pas fermée mais remise dans le pool. 
	
	
	
	} catch (NamingException | SQLException e) {
		e.printStackTrace();
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		out.println("Une erreur est survenue lors de l'utilisation de la base de données" +e.getMessage());
	}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
